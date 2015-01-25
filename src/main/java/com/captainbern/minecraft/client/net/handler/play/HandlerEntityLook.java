package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityLook;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityLook.class, protocol = ProtocolType.PLAY)
public class HandlerEntityLook implements Handler<MinecraftNetSession, PacketEntityLook> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityLook packet) {

    }    
}
