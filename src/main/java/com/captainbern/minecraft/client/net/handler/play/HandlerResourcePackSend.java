package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketResourcePackSend;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketResourcePackSend.class, protocol = ProtocolType.PLAY)
public class HandlerResourcePackSend implements Handler<MinecraftNetSession, PacketResourcePackSend> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketResourcePackSend packet) {

    }    
}
