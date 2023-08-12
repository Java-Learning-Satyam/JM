import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChellange {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean on_of = true;
        ArrayList<String> items = new ArrayList<>();

        while (on_of) {
            printMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(items);
                case 2 -> removeItems(items);
                default -> {
                    System.out.println("Quit ");
                    on_of = false;
                }
            }
            items.sort(Comparator.naturalOrder());
            System.out.println(items);
        }
    }

    private static void addItem(ArrayList<String> list) {
        System.out.println("Pleas enter item (seperated by comma) ");

        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            if (list.indexOf(i) < 0) {
                list.add(trimmed);
            }
        }

    }

    private static void removeItems(ArrayList<String> list) {
        System.out.println("Pleas enter item (seperated by comma) to remove");

        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            list.remove(trimmed);
        }

    }

    private static void printMenu() {
        System.out.println("""
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""");
    }
}
