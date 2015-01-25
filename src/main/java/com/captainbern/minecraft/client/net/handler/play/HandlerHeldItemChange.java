package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketHeldItemChange;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketHeldItemChange.class, protocol = ProtocolType.PLAY)
public class HandlerHeldItemChange implements Handler<MinecraftNetSession, PacketHeldItemChange> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketHeldItemChange packet) {

    }    
}
