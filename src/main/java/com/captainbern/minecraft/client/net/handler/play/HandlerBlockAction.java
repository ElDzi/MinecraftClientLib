package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketBlockAction;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketBlockAction.class, protocol = ProtocolType.PLAY)
public class HandlerBlockAction implements Handler<MinecraftNetSession, PacketBlockAction> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketBlockAction packet) {

    }    
}
