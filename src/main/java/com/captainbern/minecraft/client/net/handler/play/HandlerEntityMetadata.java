package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityMetadata;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityMetadata.class, protocol = ProtocolType.PLAY)
public class HandlerEntityMetadata implements Handler<MinecraftNetSession, PacketEntityMetadata> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityMetadata packet) {

    }    
}
