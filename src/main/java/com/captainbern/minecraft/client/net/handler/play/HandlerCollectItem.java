package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketCollectItem;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketCollectItem.class, protocol = ProtocolType.PLAY)
public class HandlerCollectItem implements Handler<MinecraftNetSession, PacketCollectItem> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketCollectItem packet) {

    }    
}
