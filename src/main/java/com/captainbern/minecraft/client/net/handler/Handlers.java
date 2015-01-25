package com.captainbern.minecraft.client.net.handler;

import com.captainbern.minecraft.client.MinecraftClient;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

public class Handlers {

    private Handlers() {
        super();
    }

    public static void registerHandlers() {
        try {
            ProtocolType.LOGIN.getMinecraftProtocol().registerHandlers("com.captainbern.minecraft.client.net.handler.login");
            ProtocolType.STATUS.getMinecraftProtocol().registerHandlers("com.captainbern.minecraft.client.net.handler.status");
            ProtocolType.PLAY.getMinecraftProtocol().registerHandlers("com.captainbern.minecraft.client.net.handler.play");
        } catch (Exception e) {
            MinecraftClient.getLogger().warn("Something went wrong while registering the Packet handlers!", e);
        }
    }
}
