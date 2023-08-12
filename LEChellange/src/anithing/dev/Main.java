package anithing.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static Random random = new Random();
    public static void main(String[] args) {

//        List<String> firstName = new ArrayList<>(List.of(
//                "Bob","Anna","Satyam","Raju","Saumsa"
//        ));
        String[] firstName = new String[5];
        firstName[0] = "Bob";
        firstName[1] = "Anna";
        firstName[2] = "Satyam";
        firstName[3] = "Raju";
        firstName[4] = "Saumsa";

        Arrays.setAll(firstName, i -> firstName[i].toUpperCase());
        System.out.println("Printing in upperCase");
        System.out.println(Arrays.toString(firstName));

        List<String> backedByArray = Arrays.asList(firstName);
        Arrays.setAll(firstName, (i) -> firstName[i] + " " + ((char) (random.nextInt(26) + 'A') + ".")
        );

        System.out.println("Names after middle name");
        System.out.println(Arrays.toString(firstName));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("add reverse name as last name");
//        Arrays.asList(firstName).forEach(s -> System.out.println(firstName));
        System.out.println(Arrays.toString(firstName));

        List<String> newlist =  new ArrayList<>(List.of(firstName));
        newlist.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
                s.substring(s.lastIndexOf(" ") + 1)
        ));
        System.out.println("Printing after removing duplicate");
        newlist.forEach(s -> System.out.println(s));
    }

    public static String getReversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
