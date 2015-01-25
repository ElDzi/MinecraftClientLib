package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketScoreboardObjective;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketScoreboardObjective.class, protocol = ProtocolType.PLAY)
public class HandlerScoreboardObjective implements Handler<MinecraftNetSession, PacketScoreboardObjective> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketScoreboardObjective packet) {

    }    
}
