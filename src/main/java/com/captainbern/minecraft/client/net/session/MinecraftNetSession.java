package com.captainbern.minecraft.client.net.session;

import com.captainbern.minecraft.client.Client;
import com.captainbern.minecraft.client.MinecraftClient;
import com.captainbern.minecraft.client.net.MinecraftNetworkClient;
import com.captainbern.minecraft.net.packet.AsyncablePacket;
import com.captainbern.minecraft.net.packet.Packet;
import com.captainbern.minecraft.net.packet.handshake.client.PacketHandshake;
import com.captainbern.minecraft.net.packet.login.client.PacketEncryptionResponse;
import com.captainbern.minecraft.net.packet.login.client.PacketLoginRequest;
import com.captainbern.minecraft.net.packet.play.client.PacketClientChatMessage;
import com.captainbern.minecraft.net.packet.play.client.PacketKeepAlive;
import com.captainbern.minecraft.net.pipeline.CompressionHandler;
import com.captainbern.minecraft.net.pipeline.EncryptionHandler;
import com.captainbern.minecraft.net.pipeline.NoOpHandler;
import com.captainbern.minecraft.net.protocol.MinecraftProtocol;
import com.captainbern.minecraft.net.protocol.Protocol;
import com.captainbern.minecraft.net.protocol.ProtocolState;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.net.session.BasicSession;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;

import javax.crypto.SecretKey;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.UUID;

public class MinecraftNetSession extends BasicSession {

    private Queue<Packet> packetQueue = new ArrayDeque<>();

    private Client client;
    private SecretKey secretKey;

    private String username;
    private UUID uuid;

    public MinecraftNetSession(MinecraftNetworkClient networkClient, Channel channel, Protocol protocol) {
        super(networkClient, channel, protocol);
        this.client = networkClient.getClient();
    }

    public Client getClient() {
        return this.client;
    }

    @Override
    public void handlePacket(Packet packet) {
        if (packet instanceof AsyncablePacket && ((AsyncablePacket) packet).isAsynchronous()) {
            super.handlePacket(packet);
        } else {
            this.packetQueue.add(packet);
        }
    }

    @Override
    public void onReady() {
        // TODO: Ping should be handled here
        // possible solutions:
        //  - Call some kind of "Connected" event, and handle the actual login - ping in there
        //  - Use a Callback, which we use to send the appropriate packets (since this is more of an internal
        //     thing)
        sendPacket(new PacketHandshake(MinecraftProtocol.getProtocolVersion(), "localhost", 25565, ProtocolState.LOGIN)); // The target server doesn't actually seem to care about what ip we put in here
        this.setProtocol(ProtocolType.LOGIN.getMinecraftProtocol());
        sendPacket(new PacketLoginRequest(this.client.getAuthenticator().getSelectedProfile().getName()));
    }

    @Override
    public void onDisconnect() {
    }

    @Override
    public void handleInboundException(Throwable throwable) {
        MinecraftClient.getLogger().warn("Exception while handling an incoming packet", throwable);
    }

    @Override
    public void handleOutboundException(Throwable throwable) {
        MinecraftClient.getLogger().warn("Exception while handling an outgoing packet", throwable);
    }

    @Override
    public void onHandlerException(Throwable throwable) {
        MinecraftClient.getLogger().warn("Exception while handling a packet", throwable);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public SecretKey getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(SecretKey secretKey) {
        if (this.secretKey != null)
            throw new IllegalStateException("SecretKey already set!");

        this.secretKey = secretKey;
    }

    public void enableEncryption(byte[] sharedSecret, byte[] verifyToken) {
        try {
            if (this.secretKey == null)
                throw new RuntimeException("Cannot enable the encryption without a SecretKey!");

            sendPacket(new PacketEncryptionResponse(sharedSecret, verifyToken));
            updatePipeline("encryption_handler", new EncryptionHandler(this.secretKey));
        } catch (Exception e) {
            throw new RuntimeException("Failed to enable encryption!", e);
        }
    }

    public void enableCompression(int threshold) {
        updatePipeline("compression_handler", new CompressionHandler(threshold));
    }

    public void disableCompression() {
        updatePipeline("compression_handler", NoOpHandler.INSTANCE);
    }

    private void updatePipeline(String key, ChannelHandler handler) {
        getChannel().pipeline().replace(key, key, handler);
    }

    public void pong(int keepAliveId) {
        this.sendPacket(new PacketKeepAlive(keepAliveId));
    }

    public synchronized void chat(String message) {
        Packet packet = new PacketClientChatMessage(message);
        if (this.protocol == ProtocolType.PLAY.getMinecraftProtocol()) {
            this.sendPacket(packet);
        } else {
            // TODO: add to a queue or ignore?
        }
    }

    public synchronized void tick() {
        Packet packet;
        while ((packet = this.packetQueue.poll()) != null) {
            if (this.protocol == ProtocolType.PLAY.getMinecraftProtocol()) {
                // check if server is null, if so, disconnect
            }
            super.handlePacket(packet);
        }
    }
}
