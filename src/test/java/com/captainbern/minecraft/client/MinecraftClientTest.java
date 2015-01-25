package com.captainbern.minecraft.client;

public class MinecraftClientTest {

    public static void main(String[] args) {
        Client client = new MinecraftClient("<username>");
        client.authenticate("<password>");
        client.connect("<server address>", 25565);
    }
}