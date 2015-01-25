package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketCombatEvent;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketCombatEvent.class, protocol = ProtocolType.PLAY)
public class HandlerCombatEvent implements Handler<MinecraftNetSession, PacketCombatEvent> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketCombatEvent packet) {

    }    
}
