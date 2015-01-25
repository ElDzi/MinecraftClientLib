package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketChunkData;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketChunkData.class, protocol = ProtocolType.PLAY)
public class HandlerChunkData implements Handler<MinecraftNetSession, PacketChunkData> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketChunkData packet) {

    }    
}
