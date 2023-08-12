package dev.lpa;

import jdk.jshell.EvalException;

import java.io.PipedReader;
import java.rmi.MarshalledObject;
import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {
        Course csa85 = new Course("csa101", "CSA with 8085","Computer System Architecture");
        Course os = new Course("os101", "Operating System","Operating System");

        addPurchase("Piyush", os, 139.99);
        addPurchase("Piyush Jasvani", csa85, 149.99);
        addPurchase("Keshav Vyas", csa85, 149.99);
        addPurchase("Keshav", os, 139.99);
        addPurchase("Anand", os, 139.99);
        addPurchase("Gangn Madan", csa85, 149.99);
        addPurchase("Dev", csa85, 149.99);
        addPurchase("Md Ismail ", os, 139.99);

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println();
        students.forEach((k, v) -> System.out.println(k + ": " + v));

        NavigableMap<LocalDate, List<Purchase>> datedPurchases = new TreeMap<>();

        for (Purchase p : purchases.values()) {
            datedPurchases.compute(p.purchaseDate(),
                    (pdate, plist) -> {
                        List<Purchase> list =
                        (plist == null) ? new ArrayList<>() : plist;
                        list.add(p);
                        return list;
                    });
            datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

            int currentYear = LocalDate.now().getYear();

            LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
            LocalDate week1 = firstDay.plusDays(7);
            Map<LocalDate, List<Purchase>> week1Purchases = datedPurchases.headMap(week1);
            Map<LocalDate, List<Purchase>> week2Purchases = datedPurchases.tailMap(week1);

//            System.out.println();
//            week1Purchases.forEach((key, value) -> System.out.println(key + ": " + value));
//            System.out.println();
//            week2Purchases.forEach((key, value) -> System.out.println(key + ": " + value));

            displayStats(1, week1Purchases);
            displayStats(2 , week2Purchases);

            System.out.println();

            LocalDate lastDate = datedPurchases.lastKey();
            var previousEntry = datedPurchases.lastEntry();

            while (previousEntry != null) {
                List<Purchase> lastDaysDate = previousEntry.getValue();
                System.out.println(lastDate + " purchases: " + lastDaysDate.size());

                LocalDate prevDate = datedPurchases.lowerKey(lastDate);
                previousEntry =datedPurchases.lowerEntry(lastDate);
                lastDate =prevDate;
            }

        }

    }

    private static void addPurchase(String name, Course course, double price) {
        Student existingStudent = students.get(name);
        if (existingStudent ==  null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1,15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(),
                existingStudent.getId(), price,year, day);
        purchases.put(key, purchase);
    }

    public static void displayStats(int period,
                                    Map<LocalDate, List<Purchase>> periodData) {
        System.out.println("+++++++++++++++++++++++++++++");
        Map<String, Integer> weeklyCount = new TreeMap<>();
        periodData.forEach((key, value) -> {
            System.out.println(key + ": " + value);
            for (Purchase p : value)  {
                weeklyCount.merge(p.courseId(), 1, (prev, current) -> {
                    return prev + current;
                });
            }
        });
        System.out.printf("Week %d Purchases = %s%n", period, weeklyCount);
    }
}

