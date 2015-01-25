package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketCamera;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketCamera.class, protocol = ProtocolType.PLAY)
public class HandlerCamera implements Handler<MinecraftNetSession, PacketCamera> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketCamera packet) {

    }    
}
