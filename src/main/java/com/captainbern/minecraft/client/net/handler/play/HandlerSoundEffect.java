package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSoundEffect;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSoundEffect.class, protocol = ProtocolType.PLAY)
public class HandlerSoundEffect implements Handler<MinecraftNetSession, PacketSoundEffect> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSoundEffect packet) {

    }    
}
