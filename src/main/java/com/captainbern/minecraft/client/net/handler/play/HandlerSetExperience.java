package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSetExperience;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSetExperience.class, protocol = ProtocolType.PLAY)
public class HandlerSetExperience implements Handler<MinecraftNetSession, PacketSetExperience> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSetExperience packet) {

    }    
}
