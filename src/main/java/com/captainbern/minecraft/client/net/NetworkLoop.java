package com.captainbern.minecraft.client.net;

public class NetworkLoop implements Runnable {

    private boolean isRunning = true;
    private boolean isInterrupted;

    public static final int TPS = 20;
    public static final int TICK_TIME = 1000000000 / TPS;

    private int ticks;

    private final MinecraftNetworkClient minecraftNetworkClient;

    public NetworkLoop(MinecraftNetworkClient minecraftNetworkClient) {
        this.minecraftNetworkClient = minecraftNetworkClient;
    }

    @Override
    public void run() {
        try {

            long lastTick = System.nanoTime();
            long catchUp = 0;
            long currentTick;
            long wait;

            while (this.isRunning) {

                currentTick = System.nanoTime();
                wait = TICK_TIME - (currentTick - lastTick) - catchUp;
                if (wait > 0) {
                    Thread.sleep(wait / 1000000);
                    catchUp = 0;
                    continue;
                } else {
                    catchUp = Math.min(1000000000, Math.abs(wait));
                }

                lastTick = currentTick;

                this.tick();
            }

        } catch (Throwable t) {
            this.isInterrupted = true;
        } finally {
            this.stop();
        }
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public boolean isInterrupted() {
        return this.isInterrupted;
    }

    public int getTicks() {
        return this.ticks;
    }

    public void stop() {
        this.isRunning = false;
    }

    protected void tick() {
        this.ticks++;
        this.minecraftNetworkClient.tick();
    }
}
