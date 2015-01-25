package com.captainbern.minecraft.client.net.handler.status;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.status.server.PacketStatusResponse;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketStatusResponse.class, protocol = ProtocolType.STATUS)
public class HandlerResponse implements Handler<MinecraftNetSession, PacketStatusResponse> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketStatusResponse packet) {

    }    
}
