package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketBlockBreakAnimation;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketBlockBreakAnimation.class, protocol = ProtocolType.PLAY)
public class HandlerBlockBreakAnimation implements Handler<MinecraftNetSession, PacketBlockBreakAnimation> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketBlockBreakAnimation packet) {

    }    
}
