package com.captainbern.minecraft.client;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    private static final String USERNAME = "<>";
    private static final String PASSWORD = "<>";

    private static final String SERVER_ADDRESS = "<>";
    private static final int SERVER_PORT = 25565;

    @Test
    public void testMinecraftClient() {
        Client client = new MinecraftClient(USERNAME);

        client.authenticate(PASSWORD);
        assertTrue("Not logged in correctly!", client.getAuthenticator().getUserAuthentication().isLoggedIn());

        client.connect(SERVER_ADDRESS, SERVER_PORT);
        // TODO: test if connected properly
    }
}