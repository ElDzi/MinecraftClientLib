package com.captainbern.minecraft.client.net.handler.login;

import com.captainbern.minecraft.client.MinecraftClient;
import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.login.server.PacketLoginResponse;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

import java.util.UUID;

@PacketHandler(packet = PacketLoginResponse.class, protocol = ProtocolType.LOGIN)
public class HandlerLoginSuccess implements Handler<MinecraftNetSession, PacketLoginResponse> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketLoginResponse packet) {
        MinecraftClient.getLogger().info("Login success!");
        minecraftNetSession.setUsername(packet.getUsername());
        minecraftNetSession.setUuid(UUID.fromString(packet.getUuid()));
        minecraftNetSession.setProtocol(ProtocolType.PLAY.getMinecraftProtocol());
    }    
}
