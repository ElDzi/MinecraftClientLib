package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketMaps;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketMaps.class, protocol = ProtocolType.PLAY)
public class HandlerMaps implements Handler<MinecraftNetSession, PacketMaps> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketMaps packet) {

    }    
}
