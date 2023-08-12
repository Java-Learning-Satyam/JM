package dev.lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLIsts {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas" , "milk" , "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> grocery = new ArrayList<>(list);
        grocery.add("yogurt");
        System.out.println(grocery);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickels","mustard","cheese"));
        System.out.println(nextList);

        grocery.addAll(nextList);
        System.out.println(grocery);

        System.out.println("Third item = " + grocery.get(2));

        if (grocery.contains("cheese")) {
            System.out.println("List contains cheese");
        }

        grocery.add("yogurt");
        System.out.println("first = " + grocery.indexOf("yogurt"));
        System.out.println("Last = " + grocery.lastIndexOf("yogurt"));

        System.out.println(grocery);
        grocery.remove(1);
        System.out.println(grocery);
        grocery.remove("yogurt");
        System.out.println(grocery);

        grocery.removeAll(List.of("apples","eggs"));
        System.out.println(grocery);

        grocery.retainAll(List.of("apples","milk","musterd","cheese"));
        System.out.println(grocery);

        grocery.clear();
        System.out.println(grocery);
        System.out.println("isEmpty = " + grocery.isEmpty());

        grocery.addAll(List.of("apples", "milk","musterd","cheese"));
        grocery.addAll(Arrays.asList("eggs","pickles","musterd","ham"));

        System.out.println(grocery);
        grocery.sort(Comparator.naturalOrder());
        System.out.println(grocery);
        grocery.sort(Comparator.reverseOrder());
        System.out.println(grocery);

        var groceryArray = grocery.toArray(new String[grocery.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
