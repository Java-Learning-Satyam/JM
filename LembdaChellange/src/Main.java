import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWordsLambda.accept("If mis merry on this saturday");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split("");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        System.out.println("-----------");
        printWordsForEach.accept("If mis merry on this saturday");

        printWordsLambda.accept("If mis merry on this saturday");

        Consumer<String> printWordsConsize = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
//        System.out.println("-----------");
        printWordsConsize.accept("If mis merry on this saturday");

        System.out.println("------+++++++-------");
        Function<String, String> everySecondChar = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0;i < s.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        String resultCheck = everySecondChar.apply("123456789");
        System.out.println(resultCheck);

        System.out.println(everySecondCharacter(everySecondChar,"1234567890"));

        Supplier<String> iLoveJava = () -> "I Love Java!";
        System.out.println(iLoveJava.get());
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {

        return func.apply(source);
    }
}
