package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityProperties;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityProperties.class, protocol = ProtocolType.PLAY)
public class HandlerEntityProperties implements Handler<MinecraftNetSession, PacketEntityProperties> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityProperties packet) {

    }    
}
