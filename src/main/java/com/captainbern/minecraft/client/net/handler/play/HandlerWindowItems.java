package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketWindowItems;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketWindowItems.class, protocol = ProtocolType.PLAY)
public class HandlerWindowItems implements Handler<MinecraftNetSession, PacketWindowItems> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketWindowItems packet) {

    }    
}
