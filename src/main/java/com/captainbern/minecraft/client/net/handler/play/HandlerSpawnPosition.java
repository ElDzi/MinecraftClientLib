package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSpawnPosition;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSpawnPosition.class, protocol = ProtocolType.PLAY)
public class HandlerSpawnPosition implements Handler<MinecraftNetSession, PacketSpawnPosition> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSpawnPosition packet) {

    }    
}
