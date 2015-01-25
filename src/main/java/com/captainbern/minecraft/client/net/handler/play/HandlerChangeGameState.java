package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketChangeGameState;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketChangeGameState.class, protocol = ProtocolType.PLAY)
public class HandlerChangeGameState implements Handler<MinecraftNetSession, PacketChangeGameState> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketChangeGameState packet) {

    }    
}
