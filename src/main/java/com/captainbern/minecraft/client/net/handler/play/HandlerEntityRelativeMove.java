package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityRelativeMove;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityRelativeMove.class, protocol = ProtocolType.PLAY)
public class HandlerEntityRelativeMove implements Handler<MinecraftNetSession, PacketEntityRelativeMove> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityRelativeMove packet) {

    }    
}
