package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketPlayerPositionAndLook;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketPlayerPositionAndLook.class, protocol = ProtocolType.PLAY)
public class HandlerPlayerPositionAndLook implements Handler<MinecraftNetSession, PacketPlayerPositionAndLook> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPlayerPositionAndLook packet) {

    }    
}
