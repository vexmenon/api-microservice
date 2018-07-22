package com.candidate.api;

import com.candidate.api.util.CommonUtil;
import org.junit.Test;

public class EncryptTest {

    @Test
    public void encryptTest(){
        StringBuffer s = new StringBuffer("mphasisbpo");
        s.append(":").append("mphasisbpo@456");
        try{
            String encryptedText = CommonUtil.encryptTwoWay(s.toString());

        }catch(Exception e){

        }

    }

    @Test
    public void decryptTest(){
        String encryptedText = generateEncryptedText();
        try{
            String decryptText = CommonUtil.decryptTwoWay(encryptedText);
        }catch(Exception e){

        }

    }




    public String generateEncryptedText(){
        StringBuffer s = new StringBuffer("mphasis");
        s.append(":").append("Ripplehire789");
        try{
            String encryptedText = CommonUtil.encryptTwoWay(s.toString());
            return encryptedText;
        }catch(Exception e){
            return "";
        }

    }
}
