package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSetCompression;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSetCompression.class, protocol = ProtocolType.PLAY)
public class HandlerSetCompression implements Handler<MinecraftNetSession, PacketSetCompression> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSetCompression packet) {
        if (packet.getThreshold() > 1) {
            minecraftNetSession.enableCompression(packet.getThreshold());
        } else {
            minecraftNetSession.disableCompression();
        }
    }    
}
