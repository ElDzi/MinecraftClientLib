package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketTimeUpdate;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketTimeUpdate.class, protocol = ProtocolType.PLAY)
public class HandlerTimeUpdate implements Handler<MinecraftNetSession, PacketTimeUpdate> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketTimeUpdate packet) {

    }    
}
