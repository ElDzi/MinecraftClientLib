package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketAnimation;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketAnimation.class, protocol = ProtocolType.PLAY)
public class HandlerAnimation implements Handler<MinecraftNetSession, PacketAnimation> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketAnimation packet) {

    }    
}
