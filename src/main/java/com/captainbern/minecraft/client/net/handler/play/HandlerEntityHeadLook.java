package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityHeadLook;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityHeadLook.class, protocol = ProtocolType.PLAY)
public class HandlerEntityHeadLook implements Handler<MinecraftNetSession, PacketEntityHeadLook> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityHeadLook packet) {

    }    
}
