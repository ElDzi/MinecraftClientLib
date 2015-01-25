package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketRemoveEntityEffect;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketRemoveEntityEffect.class, protocol = ProtocolType.PLAY)
public class HandlerRemoveEntityEffect implements Handler<MinecraftNetSession, PacketRemoveEntityEffect> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketRemoveEntityEffect packet) {

    }    
}
