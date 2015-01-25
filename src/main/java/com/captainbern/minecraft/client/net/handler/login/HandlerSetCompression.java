package com.captainbern.minecraft.client.net.handler.login;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.login.server.PacketLoginSetCompression;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketLoginSetCompression.class, protocol = ProtocolType.LOGIN)
public class HandlerSetCompression implements Handler<MinecraftNetSession, PacketLoginSetCompression> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketLoginSetCompression packet) {
        if (packet.getThreshold() > 1) {
            minecraftNetSession.enableCompression(packet.getThreshold());
        } else {
            minecraftNetSession.disableCompression();
        }
    }    
}
