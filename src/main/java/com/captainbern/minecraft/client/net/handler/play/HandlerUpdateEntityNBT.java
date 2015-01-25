package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketUpdateEntityNBT;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;

@PacketHandler(packet = PacketUpdateEntityNBT.class, protocol = ProtocolType.PLAY)
public class HandlerUpdateEntityNBT implements Handler<MinecraftNetSession, PacketUpdateEntityNBT> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketUpdateEntityNBT packet) {

    }    
}
