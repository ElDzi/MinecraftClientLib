package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketServerDifficulty;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketServerDifficulty.class, protocol = ProtocolType.PLAY)
public class HandlerServerDifficulty implements Handler<MinecraftNetSession, PacketServerDifficulty> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketServerDifficulty packet) {

    }    
}
