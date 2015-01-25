package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSpawnMob;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSpawnMob.class, protocol = ProtocolType.PLAY)
public class HandlerSpawnMob implements Handler<MinecraftNetSession, PacketSpawnMob> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSpawnMob packet) {

    }    
}
