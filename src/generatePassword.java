import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class generatePassword {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Password Generator: ");

        System.out.println("Enter password length");
        int passwordLength = scan.nextInt();
        scan.close();

        System.out.println("Your password: ");
        getPassword(passwordLength);

    }
    public static void getPassword(int lengthOfPassword){
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        for (int i = 0; i < lengthOfPassword; i++){
            char character = (char) tlr.nextInt(33,126);
            System.out.print(character);
        }
    }
}
