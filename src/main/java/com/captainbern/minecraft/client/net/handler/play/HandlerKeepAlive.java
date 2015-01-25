package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketKeepAlive;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketKeepAlive.class, protocol = ProtocolType.PLAY)
public class HandlerKeepAlive implements Handler<MinecraftNetSession, PacketKeepAlive> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketKeepAlive packet) {
        minecraftNetSession.pong(packet.getKeepAliveId());
    }    
}
