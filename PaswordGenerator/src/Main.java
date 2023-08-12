import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
        int length = 15;
        StringBuilder sb = new StringBuilder();
        int differentPattern = 0;
        while(differentPattern < 10) {
            for (int i = 0; i < length; i++) {
                int getElement = r.nextInt(characters.length());
                char randomChar = characters.charAt(getElement);
                sb.append(randomChar);
            }
            sb.append("\n");
            differentPattern++;
        }
        System.out.println(sb);
    }
}
