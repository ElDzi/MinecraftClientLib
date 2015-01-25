package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketDisconnect;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketDisconnect.class, protocol = ProtocolType.PLAY)
public class HandlerDisconnect implements Handler<MinecraftNetSession, PacketDisconnect> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketDisconnect packet) {

    }    
}
