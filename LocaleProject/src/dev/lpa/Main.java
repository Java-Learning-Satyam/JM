package dev.lpa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Default Locale = " + Locale.getDefault());

        Locale hi = new Locale("hi");
        Locale hiIn = new Locale.Builder().setLanguage("hi").setRegion("IN").build();
        Locale enNZ = new Locale.Builder().setLanguage("en").setRegion("NZ").build();

        var dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        for (var locale : List.of(
                Locale.getDefault(), Locale.US, hi,hiIn,Locale.UK, enNZ)) {
            System.out.println(locale.getDisplayName() + "= " +
                    LocalDateTime.now().format(dtf.withLocale(locale)));
        }
    }
}
