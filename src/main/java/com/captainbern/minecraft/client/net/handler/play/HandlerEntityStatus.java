package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityStatus;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityStatus.class, protocol = ProtocolType.PLAY)
public class HandlerEntityStatus implements Handler<MinecraftNetSession, PacketEntityStatus> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityStatus packet) {

    }    
}
