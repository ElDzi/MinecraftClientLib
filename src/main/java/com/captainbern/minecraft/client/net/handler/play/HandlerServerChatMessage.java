package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.client.MinecraftClient;
import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketServerChatMessage;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketServerChatMessage.class, protocol = ProtocolType.PLAY)
public class HandlerServerChatMessage implements Handler<MinecraftNetSession, PacketServerChatMessage> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketServerChatMessage packet) {
        MinecraftClient.getLogger().info("Chat: " + packet.getMessage().getFullText());
    }    
}
