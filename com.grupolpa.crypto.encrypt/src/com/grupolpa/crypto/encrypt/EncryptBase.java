
package com.grupolpa.crypto.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;
import sun.misc.BASE64Encoder;


public class EncryptBase {

    private String algorithm;
    private SecretKey secretKey;
    private byte[] secret = {1, 2, 3, 4, 5, 6, 7, 8};

    /**
     * Permite encriptar una cadena
     *
     * @param cadenaParaEncriptar cadena para encriptar
     * @return cadena encriptado
     */
    public String encrypt(String stringToEncrypt) throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException {

        String cadenaEncriptado = "";
        try {

            byte cadenaByte[] = stringToEncrypt.getBytes("UTF8");

            Cipher cifrar = Cipher.getInstance(algorithm);

            cifrar.init(Cipher.ENCRYPT_MODE, secretKey);

            byte enc[] = cifrar.doFinal(cadenaByte);

            cadenaEncriptado = (new BASE64Encoder()).encode(enc);


        } catch (UnsupportedEncodingException e) {
            throw e;

        } catch (NoSuchAlgorithmException e) {
            throw e;
        } catch (NoSuchPaddingException e) {
            throw e;
        } catch (InvalidKeyException e) {
            throw e;
        } catch (IllegalBlockSizeException e) {
            throw e;
        } catch (BadPaddingException e) {
            throw e;
        }

        return cadenaEncriptado;



    }

    /**
     * @return the algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * @param algorithm the algorithm to set
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * @return the secretKey
     */
    public SecretKey getSecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey the secretKey to set
     */
    public void setSecretKey(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * @return the secret
     */
    public byte[] getSecret() {
        return secret;
    }

    /**
     * @param secret the secret to set
     */
    public void setSecret(byte[] secret) {
        this.secret = secret;
    }
}
