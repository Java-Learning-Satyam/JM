package dev.lpa;

import external.Child;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent("Satyam", "17/07/2003", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);

        Person saumay = new Person("Saumay","31-01-2002");
        System.out.println(saumay);

        Person saumayCopy = new Person(saumay);
        System.out.println(saumayCopy);

        Generation g = Generation.BABY_BOOMER;

    }
}
