package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketTitle;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketTitle.class, protocol = ProtocolType.PLAY)
public class HandlerTitle implements Handler<MinecraftNetSession, PacketTitle> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketTitle packet) {

    }    
}
