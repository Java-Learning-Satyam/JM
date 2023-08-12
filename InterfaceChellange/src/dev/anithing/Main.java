package dev.anithing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Jyoti",UsageType.RESIDENTIAL));
        mappables.add(new Building("Barkatulla Ground",UsageType.SPORTS));
        mappables.add(new Building("Uit Colony",UsageType.RESIDENTIAL));

        mappables.add(new UtilityLine("BSNL Office",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Adani gas",UtilityType.GAS));
        mappables.add(new UtilityLine("Kailana",UtilityType.WATER));
        mappables.add(new UtilityLine("Sataym Green Energy",UtilityType.ELECTRICAL));
        for (var m : mappables) {
            Mappable.printProperties(m);
        }
    }
}
