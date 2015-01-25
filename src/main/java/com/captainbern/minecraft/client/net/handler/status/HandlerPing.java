package com.captainbern.minecraft.client.net.handler.status;

import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.packet.status.server.PacketPing;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketPing.class, protocol = ProtocolType.STATUS)
public class HandlerPing implements Handler<MinecraftNetSession, PacketPing> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPing packet) {
        minecraftNetSession.sendPacket(new com.captainbern.minecraft.net.packet.status.client.PacketPing(packet.getTime()));
    }    
}
