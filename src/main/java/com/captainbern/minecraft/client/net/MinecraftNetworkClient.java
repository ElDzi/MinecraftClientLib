package com.captainbern.minecraft.client.net;

import com.captainbern.minecraft.client.Client;
import com.captainbern.minecraft.client.MinecraftClient;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.NetworkClient;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.net.session.Session;
import io.netty.channel.Channel;

public class MinecraftNetworkClient extends NetworkClient {

    private final Client client;
    private MinecraftNetSession session;
    private final NetworkLoop networkLoop;

    public MinecraftNetworkClient(Client client) {
        this.client = client;

        Thread networkThread = new Thread(this.networkLoop = new NetworkLoop(this));
        networkThread.start();
    }

    public Client getClient() {
        return this.client;
    }

    @Override
    public Session newSession(Channel channel) {
        this.session = new MinecraftNetSession(this, channel, ProtocolType.HANDSHAKE.getMinecraftProtocol());
        return this.session;
    }

    @Override
    public void onConnectionFailed(Throwable cause) {
        this.session = null;
        MinecraftClient.getLogger().warn("Disconnected from the server", cause);
        this.networkLoop.stop();
        this.shutdown();
    }

    @Override
    public void onSessionInactivated(Session session) {
        this.session = null;
        MinecraftClient.getLogger().info("Disconnected from the server");
        this.networkLoop.stop();
        this.shutdown();
    }

    public MinecraftNetSession getSession() {
        return this.session;
    }

    public void tick() {
        if (this.session != null)
            this.session.tick();
    }
}
