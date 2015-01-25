package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityLookAndRelativeMove;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityLookAndRelativeMove.class, protocol = ProtocolType.PLAY)
public class HandlerEntityLookAndRelativeMove implements Handler<MinecraftNetSession, PacketEntityLookAndRelativeMove> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityLookAndRelativeMove packet) {

    }    
}
