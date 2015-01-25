package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSpawnPainting;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSpawnPainting.class, protocol = ProtocolType.PLAY)
public class HandlerSpawnPainting implements Handler<MinecraftNetSession, PacketSpawnPainting> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSpawnPainting packet) {

    }    
}
