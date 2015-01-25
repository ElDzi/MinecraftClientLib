package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketPlayerAbilities;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketPlayerAbilities.class, protocol = ProtocolType.PLAY)
public class HandlerPlayerAbilities implements Handler<MinecraftNetSession, PacketPlayerAbilities> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketPlayerAbilities packet) {

    }    
}
