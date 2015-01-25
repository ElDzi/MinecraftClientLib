package com.captainbern.minecraft.client;

import com.captainbern.minecraft.client.auth.AuthResult;
import com.captainbern.minecraft.client.auth.IAuthenticator;
import com.captainbern.minecraft.client.net.MinecraftNetworkClient;
import com.google.common.eventbus.EventBus;

import java.net.Proxy;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

public interface Client {

    public ExecutorService getExecutorService();

    public MinecraftNetworkClient getNetworkClient();

    public EventBus eventbus();

    public String getName();

    public IAuthenticator getAuthenticator();

    public AuthResult authenticate(String password);

    public UUID getClientToken();

    public Proxy getProxy();

    public void setProxy(Proxy proxy);

    public Server ping(String addess, int port);

    public void connect(String address, int port);

    public boolean isConnected();

    public Server getCurrentServer();

    public void disconnect();

    // client-specific actions
    public void chat(String message);
}
