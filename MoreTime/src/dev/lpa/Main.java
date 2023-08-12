package dev.lpa;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.setProperty("user.timezone", "America/Los_Angeles");
        System.out.println(ZoneId.systemDefault());

        System.out.println("Number of TZs = " + ZoneId.getAvailableZoneIds().size());

        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.startsWith("US"))
                .sorted()
                .map(ZoneId::of)
                .forEach(z -> System.out.println(z.getId() + ": " + z.getRules()));
        LocalDateTime td = LocalDateTime.now();
        System.out.println(td);

        Instant instant = Instant.now();
        System.out.println(instant);

        for (ZoneId z : List.of(
                ZoneId.of("Asia/Calcutta"),
                ZoneId.of("Australia/Sydney"),
                ZoneId.of("US/Alaska"))) {
            DateTimeFormatter zoneFormat = DateTimeFormatter.ofPattern("z:zzzz");
            System.out.println(z);
            System.out.println("\t" + instant.atZone(z).format(zoneFormat));
            System.out.println("\t" + z.getRules().getDaylightSavings(instant));
            System.out.println("\t" + z.getRules().isDaylightSavings(instant));
        }

        LocalDate exmover = LocalDate.of(2023,5,23);
        Period timePast = Period.between(LocalDate.now(), exmover);
        System.out.println(timePast);

        Duration timeSince =
                Duration.between(Instant.now(), exmover.atStartOfDay().toInstant(ZoneOffset.UTC));
        System.out.println(timeSince);
    }
}
