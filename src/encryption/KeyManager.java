//this class manages the password and returns SecretKeyspec




package encryption;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class KeyManager {
    public  static  SecretKey genKey(String userKey){

        return  new SecretKeySpec(userKey.getBytes(),"AES");
    }
}
