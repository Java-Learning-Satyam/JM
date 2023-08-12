package dev.lpa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate Five5 = LocalDate.of(2022, 5, 5);
        System.out.println(Five5);

        LocalDate Day125 = LocalDate.ofYearDay(2022,125);
        System.out.println(Day125);

        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(May5th);

        LocalDate May5 = LocalDate.parse("2022-05-05");
        System.out.println(May5);

        System.out.println(May5.getYear());
        System.out.println(May5.getMonth());

        System.out.println(May5.getMonthValue());

        System.out.println(May5.getDayOfMonth());
        System.out.println(May5.getDayOfWeek());
        System.out.println(May5.getDayOfYear() );

        System.out.println("--------------------------");
        May5.datesUntil(May5.plusDays(7))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        May5.datesUntil(May5.plusYears(1), Period.ofDays(7))
                .forEach(System.out::println);

        LocalTime time = LocalTime.now();
        System.out.println(time);

    }
}
