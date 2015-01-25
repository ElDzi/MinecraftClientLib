package com.captainbern.minecraft.client;

import com.captainbern.minecraft.client.auth.AuthResult;
import com.captainbern.minecraft.client.auth.Authenticator;
import com.captainbern.minecraft.client.auth.IAuthenticator;
import com.captainbern.minecraft.client.net.MinecraftNetworkClient;
import com.captainbern.minecraft.client.net.handler.Handlers;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.google.common.eventbus.EventBus;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MinecraftClient implements Client {

    private static final Logger LOGGER = LogManager.getLogger(MinecraftClient.class);

    private ThreadFactory threadFactory = new ThreadFactoryBuilder()
            .setDaemon(true)
            .setPriority(Thread.NORM_PRIORITY)
            .setNameFormat("Client-Thread-#%d")
            .build();
    private ExecutorService executorService = Executors.newSingleThreadExecutor(this.threadFactory);

    private Proxy proxy = Proxy.NO_PROXY;
    private EventBus eventBus;
    private final String username;
    private UUID clientToken;

    private IAuthenticator authenticator;
    private MinecraftNetworkClient netClient;

    public MinecraftClient(String userName) {
        this.eventBus = new EventBus("Client-EventBus");
        this.username = userName;
        this.clientToken = UUID.randomUUID();

        this.authenticator = new Authenticator(this);
        this.netClient = new MinecraftNetworkClient(this);
        Handlers.registerHandlers();
    }

    @Override
    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override
    public MinecraftNetworkClient getNetworkClient() {
        return this.netClient;
    }

    @Override
    public EventBus eventbus() {
        return this.eventBus;
    }

    @Override
    public String getName() {
        return this.username;
    }

    @Override
    public IAuthenticator getAuthenticator() {
        return this.authenticator;
    }

    @Override
    public AuthResult authenticate(String password) {
        AuthResult authResult = this.authenticator.auth(password, false);
        // TODO: perhaps some kind of event here
        return authResult;
    }

    @Override
    public UUID getClientToken() {
        return this.clientToken;
    }

    @Override
    public Proxy getProxy() {
        return this.proxy;
    }

    @Override
    public void setProxy(Proxy proxy) {
        if (proxy == null)
            throw new IllegalArgumentException("Cannot set the Proxy to NULL!");

        this.proxy = proxy;
    }

    @Override
    public Server ping(String address, int port) {
        ChannelFuture channelFuture = this.connect(new InetSocketAddress(address, port));
        Channel channel = channelFuture.awaitUninterruptibly().channel();
        if (!channel.isActive())
            throw new RuntimeException("Failed to ping: " + address + ":" + port);

        return null;
    }

    @Override
    public void connect(String serverIp, int port) {
        ChannelFuture channelFuture = this.connect(new InetSocketAddress(serverIp, port));
        Channel channel = channelFuture.awaitUninterruptibly().channel();
        if (!channel.isActive())
            throw new RuntimeException("Failed to connect to: " + serverIp + ":" + port);

        getLogger().info("Successfully connected to: " + serverIp + ":" + port);
    }

    private ChannelFuture connect(InetSocketAddress address) {
        return this.netClient.connect(address);
    }

    @Override
    public boolean isConnected() {
        return this.netClient.getSession() != null && netClient.getSession().isAlive();
    }

    @Override
    public Server getCurrentServer() {
        return null;
    }

    @Override
    public void disconnect() {
        this.netClient.shutdown();
    }

    @Override
    public void chat(String message) {
        if (this.isConnected()) {
            this.netClient.getSession().chat(message);
        }
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
