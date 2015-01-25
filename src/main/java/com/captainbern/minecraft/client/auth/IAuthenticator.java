package com.captainbern.minecraft.client.auth;

import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.minecraft.MinecraftSessionService;

public interface IAuthenticator {

    public AuthResult auth(final String password, boolean force);

    public void joinServer(String hash);

    public String getAccessToken();

    public GameProfile getSelectedProfile();

    public AuthenticationService getAuthenticationService();

    public UserAuthentication getUserAuthentication();

    public MinecraftSessionService getMinecraftSessionService();
}
