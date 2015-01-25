package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketMultiBlockChange;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketMultiBlockChange.class, protocol = ProtocolType.PLAY)
public class HandlerMultiBlockChange implements Handler<MinecraftNetSession, PacketMultiBlockChange> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketMultiBlockChange packet) {

    }    
}
