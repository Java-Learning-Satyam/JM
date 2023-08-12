package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
    LinkedList<String> placesToVisit= new LinkedList<>();
//        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydeny");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);


    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println("s1 was removed " + s1);

        String s2 = list.removeFirst();
        System.out.println("s2 was removed " + s2);

        String s3 = list.removeLast();
        System.out.println("s3 was removed " + s3);

        // Queue/Deque pool methods
        String p1 = list.poll(); //removes first element
        System.out.println(p1 + " Was removed");
        String p2 = list.pollFirst(); //removes first element
        System.out.println(p2 + " Was removed");
        String p3 = list.pollLast(); //removes Last element
        System.out.println(p3 + " Was removed");

        list.push("Sidney");
        list.push("Brisbane");
        list.push("Camberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " Was removed");

    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrived Elements = " + list.get(4));

        System.out.println("First Element  = " + list.getFirst());
        System.out.println("Last Element  = " + list.getLast());

        System.out.println("Darvin is at pogistion: " + list.indexOf("Darwin"));
        System.out.println("Melvourne is at pogistion: " +
                list.lastIndexOf("Melbourne"));
        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Elements form peek() = " + list.peek());
        System.out.println("Elements form peekFirst() = " + list.peekFirst());
        System.out.println("Elements form peekLast() = " + list.peekLast());

    }

    private static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown  = list.getFirst();
        ListIterator<String> iterator =  list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivehone");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
