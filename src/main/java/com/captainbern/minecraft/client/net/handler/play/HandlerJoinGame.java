package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketJoinGame;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketJoinGame.class, protocol = ProtocolType.PLAY)
public class HandlerJoinGame implements Handler<MinecraftNetSession, PacketJoinGame> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketJoinGame packet) {

    }    
}
