package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketUpdateSign;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketUpdateSign.class, protocol = ProtocolType.PLAY)
public class HandlerUpdateSign implements Handler<MinecraftNetSession, PacketUpdateSign> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketUpdateSign packet) {

    }    
}
