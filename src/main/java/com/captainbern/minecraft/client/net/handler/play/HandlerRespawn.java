package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketRespawn;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketRespawn.class, protocol = ProtocolType.PLAY)
public class HandlerRespawn implements Handler<MinecraftNetSession, PacketRespawn> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketRespawn packet) {

    }    
}
