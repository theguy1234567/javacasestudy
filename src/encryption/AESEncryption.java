package encryption;



import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public  class AESEncryption{
    public  static String encrypt(String text, SecretKey password) throws Exception{

        //crating a cipher instace
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(cipher.ENCRYPT_MODE, password);
        //AES takes bin format bytes not plain text so byte[]arr is used to store
        byte [] encryptedBytes = cipher.doFinal(text.getBytes());
        //this arr is in unreadable format so we use basew64
        return  Base64.getEncoder().encodeToString(encryptedBytes);


    }
    public  static  String decrypt(String encryptedText , SecretKey password)throws  Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(cipher.DECRYPT_MODE, password);
        byte [] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }

}
