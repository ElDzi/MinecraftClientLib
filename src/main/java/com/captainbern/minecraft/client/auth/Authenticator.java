package com.captainbern.minecraft.client.auth;

import com.captainbern.minecraft.client.Client;
import com.captainbern.minecraft.client.MinecraftClient;
import com.mojang.authlib.Agent;
import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserMigratedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

public class Authenticator implements IAuthenticator {

    private final Client client;

    private AuthenticationService authenticationService;
    private UserAuthentication userAuthentication;
    private MinecraftSessionService minecraftSessionService;

    private String accessToken = "";
    private GameProfile selectedProfile;

    public Authenticator(Client client) {
        this.client = client;
        this.selectedProfile = new GameProfile(null, this.client.getName());
        this.authenticationService = new YggdrasilAuthenticationService(this.client.getProxy(), this.client.getClientToken().toString());
        this.userAuthentication = this.authenticationService.createUserAuthentication(Agent.MINECRAFT);
        this.minecraftSessionService = this.authenticationService.createMinecraftSessionService();
    }

    @Override
    public AuthResult auth(final String password, boolean force) {
        if (this.userAuthentication.isLoggedIn() && !force) {
            return AuthResult.ALREADY_LOGGED_IN;
        } else {
            this.userAuthentication.logOut();
            this.userAuthentication.setUsername(this.client.getName());
            this.userAuthentication.setPassword(password);

            try {
                this.userAuthentication.logIn();

                this.accessToken = this.userAuthentication.getAuthenticatedToken();
                this.selectedProfile = this.userAuthentication.getSelectedProfile();

                return AuthResult.SUCCESS;
            } catch (UserMigratedException ex) {
                return AuthResult.USER_MIGRATED;
            } catch (InvalidCredentialsException ex2) {
                return AuthResult.INVALID_CREDENTIALS;
            } catch (AuthenticationException ex3) {
                return AuthResult.AUTH_EXCEPTION;
            }
        }
    }

    @Override
    public void joinServer(String hash) {
        if (!this.userAuthentication.isLoggedIn())
            return;

        try {
            this.minecraftSessionService.joinServer(this.selectedProfile, this.accessToken, hash);
        } catch(AuthenticationUnavailableException e) {
            MinecraftClient.getLogger().warn("Login Failed: Login server is unavailable", e);
        } catch(InvalidCredentialsException e) {
            MinecraftClient.getLogger().warn("Login Failed: Invalid credentials!", e);
        } catch(AuthenticationException e) {
            MinecraftClient.getLogger().warn("Login Failed: An error occurred", e);
        }
    }

    @Override
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override
    public GameProfile getSelectedProfile() {
        return this.selectedProfile;
    }

    @Override
    public AuthenticationService getAuthenticationService() {
        return this.authenticationService;
    }

    @Override
    public UserAuthentication getUserAuthentication() {
        return this.userAuthentication;
    }

    @Override
    public MinecraftSessionService getMinecraftSessionService() {
        return this.minecraftSessionService;
    }
}
