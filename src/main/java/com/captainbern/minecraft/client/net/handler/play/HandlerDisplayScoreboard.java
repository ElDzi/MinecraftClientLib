package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketDisplayScoreboard;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketDisplayScoreboard.class, protocol = ProtocolType.PLAY)
public class HandlerDisplayScoreboard implements Handler<MinecraftNetSession, PacketDisplayScoreboard> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketDisplayScoreboard packet) {

    }    
}
