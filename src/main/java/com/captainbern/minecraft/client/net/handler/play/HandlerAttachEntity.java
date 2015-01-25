package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketAttachEntity;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketAttachEntity.class, protocol = ProtocolType.PLAY)
public class HandlerAttachEntity implements Handler<MinecraftNetSession, PacketAttachEntity> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketAttachEntity packet) {

    }    
}
