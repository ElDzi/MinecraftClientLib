package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketPlayerListHeaderFooter;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketPlayerListHeaderFooter.class, protocol = ProtocolType.PLAY)
public class HandlerPlayerListHeaderFooter implements Handler<MinecraftNetSession, PacketPlayerListHeaderFooter> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPlayerListHeaderFooter packet) {

    }    
}
