package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityTeleport;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityTeleport.class, protocol = ProtocolType.PLAY)
public class HandlerEntityTeleport implements Handler<MinecraftNetSession, PacketEntityTeleport> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityTeleport packet) {

    }    
}
