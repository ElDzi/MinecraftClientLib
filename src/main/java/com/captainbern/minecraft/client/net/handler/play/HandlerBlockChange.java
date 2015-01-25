package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketBlockChange;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketBlockChange.class, protocol = ProtocolType.PLAY)
public class HandlerBlockChange implements Handler<MinecraftNetSession, PacketBlockChange> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketBlockChange packet) {

    }    
}
