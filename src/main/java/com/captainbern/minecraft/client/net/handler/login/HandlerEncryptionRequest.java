package com.captainbern.minecraft.client.net.handler.login;

import com.captainbern.minecraft.net.handler.PacketHandler;
import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.packet.login.server.PacketEncryptionRequest;
import com.captainbern.minecraft.net.protocol.types.ProtocolType;
import com.captainbern.minecraft.client.net.session.MinecraftNetSession;
import com.captainbern.minecraft.net.util.CryptUtil;

import javax.crypto.SecretKey;
import java.math.BigInteger;
import java.security.PublicKey;

@PacketHandler(packet = PacketEncryptionRequest.class, protocol = ProtocolType.LOGIN)
public class HandlerEncryptionRequest implements Handler<MinecraftNetSession, PacketEncryptionRequest> {

    @Override
    public void handle(MinecraftNetSession minecraftNetSession, PacketEncryptionRequest packet) {
        try {
            SecretKey secretKey = CryptUtil.generateSharedKey();
            minecraftNetSession.setSecretKey(secretKey);

            PublicKey publicKey = CryptUtil.decodePublicKey(packet.getPublicKey());

            byte[] sharedEncrypted = CryptUtil.encryptData(publicKey, secretKey.getEncoded());
            byte[] verifyEncrypted = CryptUtil.encryptData(publicKey, packet.getVerifyToken());

            String serverHash = new BigInteger(CryptUtil.getServerIdHash(packet.getServerId(), publicKey, secretKey)).toString(16);
            minecraftNetSession.getClient().getAuthenticator().joinServer(serverHash);

            minecraftNetSession.enableEncryption(sharedEncrypted, verifyEncrypted);
        } catch (Exception e) {
            throw new RuntimeException("Failed to handle the encryption request!", e);
        }
    }    
}
