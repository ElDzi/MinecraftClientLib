package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSpawnPlayer;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSpawnPlayer.class, protocol = ProtocolType.PLAY)
public class HandlerSpawnPlayer implements Handler<MinecraftNetSession, PacketSpawnPlayer> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSpawnPlayer packet) {

    }    
}
