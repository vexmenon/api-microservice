package com.candidate.api.util;


import com.candidate.api.exception.ApplicationException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
public class CommonUtil {

    private static final String ALGO = "AES";
	private static final String aesKey = "BUDDYTOKEY123456";





    public static String encryptTwoWay(String data) throws ApplicationException {
        try {
            Key key = generateKey(aesKey, ALGO);
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(data.getBytes());
            String encryptedValue = new BASE64Encoder().encode(encVal);
            return encryptedValue;
        }catch(Exception e){
            throw new ApplicationException(e.getMessage());
        }

    }
	private static Key generateKey(String salt, String algo) throws Exception {
		Key key = new SecretKeySpec(salt.getBytes(), algo);
		return key;
	}

    public static String decryptTwoWay(String encryptedData) throws ApplicationException {
        try {
            Key key = generateKey(aesKey, ALGO);
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
            byte[] decValue = c.doFinal(decordedValue);
            String decryptedValue = new String(decValue);
            return decryptedValue;
        }catch(Exception e){
            throw new ApplicationException(e.getMessage());
        }
    }


}
