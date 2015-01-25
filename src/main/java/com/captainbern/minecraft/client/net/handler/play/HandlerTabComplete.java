package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketTabComplete;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketTabComplete.class, protocol = ProtocolType.PLAY)
public class HandlerTabComplete implements Handler<MinecraftNetSession, PacketTabComplete> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketTabComplete packet) {

    }    
}
