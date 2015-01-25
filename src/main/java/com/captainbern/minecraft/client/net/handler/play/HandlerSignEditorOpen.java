package com.captainbern.minecraft.client.net.handler.play;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.packet.play.server.PacketSignEditorOpen;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;

@PacketHandler(packet = PacketSignEditorOpen.class, protocol = ProtocolType.PLAY)
public class HandlerSignEditorOpen implements Handler<MinecraftNetSession, PacketSignEditorOpen> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketSignEditorOpen packet) {

    }    
}
