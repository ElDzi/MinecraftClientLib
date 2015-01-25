package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketDestroyEntities;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketDestroyEntities.class, protocol = ProtocolType.PLAY)
public class HandlerDestroyEntities implements Handler<MinecraftNetSession, PacketDestroyEntities> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketDestroyEntities packet) {

    }    
}
