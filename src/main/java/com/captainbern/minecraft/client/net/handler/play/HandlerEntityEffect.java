package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityEffect;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityEffect.class, protocol = ProtocolType.PLAY)
public class HandlerEntityEffect implements Handler<MinecraftNetSession, PacketEntityEffect> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityEffect packet) {

    }    
}
