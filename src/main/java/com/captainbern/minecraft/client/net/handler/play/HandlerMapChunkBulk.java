package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketMapChunkBulk;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketMapChunkBulk.class, protocol = ProtocolType.PLAY)
public class HandlerMapChunkBulk implements Handler<MinecraftNetSession, PacketMapChunkBulk> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketMapChunkBulk packet) {

    }    
}
