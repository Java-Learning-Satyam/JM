package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("By using .formatted = " + helloWorld);
        System.out.println("By using .format = " + helloWorld2);
//        System.out.println(format("%s %s","Hello ", "World"));
        String hw3 = Main.format("%s %s", "Hello", "World");
        System.out.println(hw3);

        String testString = "Anyone an learn abc's, 123's, and any regular expression";
        String replacement = "(-)";

        String[] patterns = {
                "abc",
                "123",
                "A"
        };

        for (var pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern: " + pattern + " => " + output);
        }

        String paragraph = """
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Fillet of a fenny snake,
                In the caldron boil and bake;
                Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                """;

        String[] lines = paragraph.split("\\R");
        System.out.println("This paragraph has " + lines.length + " lines");
        String[] words  = paragraph.split("\\s");
        System.out.println("This paragraph has " + words.length + " Words");
        System.out.println(paragraph.replaceAll("[a-zA-Z]+ble","[GRUB]"));





    }

    private static String format(String regexp, String... args) {
        int i = 0;
        while (regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[i++]);
        }
        return regexp;
    }
}
