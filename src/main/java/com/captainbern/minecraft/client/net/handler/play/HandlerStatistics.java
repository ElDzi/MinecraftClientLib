package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketStatistics;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketStatistics.class, protocol = ProtocolType.PLAY)
public class HandlerStatistics implements Handler<MinecraftNetSession, PacketStatistics> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketStatistics packet) {

    }    
}
