package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketEntityEquipment;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketEntityEquipment.class, protocol = ProtocolType.PLAY)
public class HandlerEntityEquipment implements Handler<MinecraftNetSession, PacketEntityEquipment> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEntityEquipment packet) {

    }    
}
