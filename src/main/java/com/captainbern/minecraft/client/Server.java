package com.captainbern.minecraft.client;

import java.net.InetAddress;

public interface Server {

    public InetAddress getInetAddress();

    public String getMotd();

    public int getOnlinePlayers();

    public int getMaxOnlinePlayers();

    public String getVersion();

    public int getProtocolVersion();
}
