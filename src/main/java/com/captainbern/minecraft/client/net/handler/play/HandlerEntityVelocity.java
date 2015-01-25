package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityVelocity;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityVelocity.class, protocol = ProtocolType.PLAY)
public class HandlerEntityVelocity implements Handler<MinecraftNetSession, PacketEntityVelocity> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityVelocity packet) {

    }    
}
