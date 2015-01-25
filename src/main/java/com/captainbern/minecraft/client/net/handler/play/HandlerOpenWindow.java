package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketOpenWindow;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketOpenWindow.class, protocol = ProtocolType.PLAY)
public class HandlerOpenWindow implements Handler<MinecraftNetSession, PacketOpenWindow> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketOpenWindow packet) {

    }    
}
