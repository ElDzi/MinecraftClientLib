package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEffect;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketEffect.class, protocol = ProtocolType.PLAY)
public class HandlerEffect implements Handler<MinecraftNetSession, PacketEffect> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEffect packet) {

    }    
}
