//importing packages
package  ui;
import java.util.Scanner;
import encryption.AESEncryption;
import encryption.KeyManager;
import javax.crypto.SecretKey;
//importing packages


//main class
public class Main {

    public static void main(String[] args) {

        SecretKey seckey = null;
        String enteredPassword = null;
        String encryptedText = null;
        Scanner scan = new Scanner(System.in);
        int count = 0;
        try {
            System.out.println("\nWelcome to Encrypto!");
            System.out.println("version 2.1.0\n");
            while (true) {
                System.out.println("----------------------------------------------");

                System.out.println("1.set password\n2.encrypt text\n3.decrypt\n4.exit");
                int opt = scan.nextInt();
                scan.nextLine();
                switch (opt) {
                    case 1:
                        //set password
                        System.out.println("enter you password (16 char long)");
                        enteredPassword = scan.nextLine();
                        boolean check = checkpassword(enteredPassword);
                        if (check == true) {
                            seckey = KeyManager.genKey(enteredPassword);
                            count+=1;

                        }else{
                            System.out.println("retry");
                        }
                        break;
                    case 2:
                        //enxrypt text
                        if(count<1){
                            System.out.println("set your password first!");
                            break;
                        }
                        System.out.println("enter text to encrypt");
                        String input = scan.nextLine();
                        encryptedText = AESEncryption.encrypt(input,seckey);
                        System.out.println("enxrypted text:" + encryptedText);
                        break;
                    case 3:
                        if(count<1){
                            System.out.println("set your password first!");
                            break;
                        }
                        System.out.println("enter password to decrypt");
                        String key = scan.nextLine();
                        if(key.equals(enteredPassword)){
                            SecretKey enteredSecretKey = KeyManager.genKey(key);
                            String decryptedText = AESEncryption.decrypt(encryptedText,enteredSecretKey);
                            System.out.println("decrypted text: "+decryptedText);
                        }else{
                            System.out.println("wrong key!");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using Encrypto!");
                        System.out.println("exiting");
                        scan.close();
                        System.exit(0);
                        break;

                }
            }

        } catch (Exception e){
            System.out.println("An errror occured: "+e.getMessage());
            if(e.getMessage() == null){
                System.out.println("no option selected");


            }
            scan.nextLine();
            e.printStackTrace();
        }
        scan.close();



    }
    public  static boolean checkpassword(String password){
        if(password.length()>16 || password.length()<16 || password.length()!=16){
            System.out.println("password should be below 16");
            return false;
        }
        System.out.println("password set");
        return true;
    }
}