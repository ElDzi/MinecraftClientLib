package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketUpdateBlockEntity;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketUpdateBlockEntity.class, protocol = ProtocolType.PLAY)
public class HandlerUpdateBlockEntity implements Handler<MinecraftNetSession, PacketUpdateBlockEntity> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketUpdateBlockEntity packet) {

    }    
}
