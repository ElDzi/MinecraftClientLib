package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketConfirmTransaction;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketConfirmTransaction.class, protocol = ProtocolType.PLAY)
public class HandlerConfirmTransaction implements Handler<MinecraftNetSession, PacketConfirmTransaction> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketConfirmTransaction packet) {

    }    
}
