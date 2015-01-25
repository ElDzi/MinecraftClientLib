package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketExplosion;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketExplosion.class, protocol = ProtocolType.PLAY)
public class HandlerExplosion implements Handler<MinecraftNetSession, PacketExplosion> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketExplosion packet) {

    }    
}
