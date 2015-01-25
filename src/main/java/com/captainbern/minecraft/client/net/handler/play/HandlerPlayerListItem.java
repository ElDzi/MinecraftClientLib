package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketPlayerListItem;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketPlayerListItem.class, protocol = ProtocolType.PLAY)
public class HandlerPlayerListItem implements Handler<MinecraftNetSession, PacketPlayerListItem> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPlayerListItem packet) {

    }    
}
