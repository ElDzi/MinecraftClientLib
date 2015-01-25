package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketUpdateHealth;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketUpdateHealth.class, protocol = ProtocolType.PLAY)
public class HandlerUpdateHealth implements Handler<MinecraftNetSession, PacketUpdateHealth> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketUpdateHealth packet) {

    }    
}
