package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketWorldBorder;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketWorldBorder.class, protocol = ProtocolType.PLAY)
public class HandlerWorldBorder implements Handler<MinecraftNetSession, PacketWorldBorder> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketWorldBorder packet) {

    }    
}
