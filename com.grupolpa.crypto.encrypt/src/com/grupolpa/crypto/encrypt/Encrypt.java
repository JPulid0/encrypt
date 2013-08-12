/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupolpa.crypto.encrypt;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author administrator
 */
public class Encrypt {
    
    /*
     * Permite encriptar una cadena
     *
     * @param stringToEncrypt cadena para encriptar
     * @return cadena encriptado
     */  
    public static String encrypt(String stringToEncrypt) throws Exception {
        String encryptedString;

        EncryptBase encryptBase = new EncryptBase();

        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey key = skf.generateSecret(new DESKeySpec(encryptBase.getSecret()));
        encryptBase.setSecretKey(key);
        encryptBase.setAlgorithm("DES");
        encryptedString = encryptBase.encrypt(stringToEncrypt);


        return encryptedString;

    }

  
    
}
