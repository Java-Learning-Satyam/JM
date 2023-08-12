import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(2));

        List<String> arr = Arrays.asList("Satyam","Ramu","Shubham","Saumsa","Pulkit");
        Consumer<String> print = s -> System.out.println(arr);
        arr.forEach(print);

        Supplier<Integer> generateRandomNum = () -> {
            return random.nextInt(0,5000);
        };

        Supplier<Character> generateRandomChar = () -> {
            int asciValue = random.nextInt(26) + 97;
            return (char) asciValue;
        };

        char[] charArray = new char[9];
        for (int i =0; i < 9; i++) {
            charArray[i] = generateRandomChar.get();
        }
        int random = generateRandomNum.get();
        System.out.println(Arrays.toString(charArray));
        System.out.println(random);
    }
}
