package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketUpdateScore;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketUpdateScore.class, protocol = ProtocolType.PLAY)
public class HandlerUpdateScore implements Handler<MinecraftNetSession, PacketUpdateScore> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketUpdateScore packet) {

    }    
}
