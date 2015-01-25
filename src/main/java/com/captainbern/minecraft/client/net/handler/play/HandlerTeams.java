package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketTeams;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketTeams.class, protocol = ProtocolType.PLAY)
public class HandlerTeams implements Handler<MinecraftNetSession, PacketTeams> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketTeams packet) {

    }    
}
