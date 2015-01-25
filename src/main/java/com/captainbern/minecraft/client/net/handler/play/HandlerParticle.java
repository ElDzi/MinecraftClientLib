package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketParticle;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketParticle.class, protocol = ProtocolType.PLAY)
public class HandlerParticle implements Handler<MinecraftNetSession, PacketParticle> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketParticle packet) {
    }    
}
