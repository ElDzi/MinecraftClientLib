package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketPluginMessage;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketPluginMessage.class, protocol = ProtocolType.PLAY)
public class HandlerPluginMessage implements Handler<MinecraftNetSession, PacketPluginMessage> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPluginMessage packet) {

    }    
}
