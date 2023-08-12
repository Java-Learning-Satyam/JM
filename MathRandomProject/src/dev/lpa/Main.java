package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//      int maxMinusFive = Integer.MAX_VALUE - 5;
//      for(int j = 0, id = maxMinusFive; j < 10; id = Math.incrementExact(id), j++) {
//          System.out.printf("Assigning id %,d%n", id);
//      }

        System.out.println(Math.abs(-50));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println("Max = " + Math.max(10, -10));
        System.out.println("Min = " + Math.min(10.000003, 10.0001));

        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round up = " + Math.round(10.8));
        System.out.println("Round ? = " + Math.round(10.5));

        System.out.println("Floor = " + Math.floor(10.8));
        System.out.println("Ceil = " + Math.floor(10.2));

        System.out.println("Square root of 100 = " + Math.sqrt(100));
        System.out.println("2 to  the third power (2*2*2) = " + Math.pow(2, 3));
        System.out.println("10 to the fifth power (10*10*10*10*10) = " + Math.pow(10, 2));

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d = %1$c%n",(int) (Math.random() * 26) + 65);
        }

        System.out.println("-------------------------");
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d = %1$c%n", r.nextInt(65,91));
        }


        System.out.println("-------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d = %1$c%n",
                    r.nextInt((int) 'A', (int) 'Z' + 1));
        }

        System.out.println("-------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d%n", r.nextInt(-10, 11));
        }

        System.out.println("-------------------------");
        r.ints()
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        r.ints(0, 4)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        r.ints(10, 0, 10)
                .forEach(System.out::println);


        System.out.println("-------------------------");
        r.ints(10)
                .forEach(System.out::println);

        long naoTime = System.nanoTime();
        Random pseudoRandom = new Random(naoTime);
        System.out.println("-------------------------");
        pseudoRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));

        Random notReallyRandom = new Random(naoTime);
        System.out.println("\n-------------------------");
        notReallyRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));

    }
}
