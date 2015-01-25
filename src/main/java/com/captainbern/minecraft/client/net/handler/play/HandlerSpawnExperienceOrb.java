package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSpawnExperienceOrb;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSpawnExperienceOrb.class, protocol = ProtocolType.PLAY)
public class HandlerSpawnExperienceOrb implements Handler<MinecraftNetSession, PacketSpawnExperienceOrb> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSpawnExperienceOrb packet) {

    }    
}
