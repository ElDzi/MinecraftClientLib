package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntity;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketEntity.class, protocol = ProtocolType.PLAY)
public class HandlerEntity implements Handler<MinecraftNetSession, PacketEntity> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntity packet) {

    }    
}
