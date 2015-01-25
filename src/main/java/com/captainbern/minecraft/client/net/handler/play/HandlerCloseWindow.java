package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketCloseWindow;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketCloseWindow.class, protocol = ProtocolType.PLAY)
public class HandlerCloseWindow implements Handler<MinecraftNetSession, PacketCloseWindow> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketCloseWindow packet) {

    }    
}
