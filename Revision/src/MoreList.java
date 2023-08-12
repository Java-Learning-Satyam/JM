import java.util.*;

public class MoreList {
    public static void main(String[] args) {
        ArrayList<String> gadiKiList = new ArrayList<>(
                List.of ("Porch","Fortuiner","Ferrari","Private Aeroplane")
        );

        ArrayList<String> BikeKiList = new ArrayList<>(
                List.of("Hayate","CBR","Shine","Racing bike")
        );

        gadiKiList.addAll(BikeKiList);
        System.out.println(gadiKiList);

        if (gadiKiList.contains("Hayate")) {
            System.out.println("List contain Hayate");
        }
        System.out.println("ret -1 if not found ,if found return index " + gadiKiList.indexOf("splender"));
        System.out.println("ret -1 if not found ,if found return index from last " + gadiKiList.lastIndexOf("Hayate"));

        System.out.println(gadiKiList); // apna nai pahelai he dekh lia hai removing element by index
        gadiKiList.remove("Shine");
        System.out.println(gadiKiList);

//        gadiKiList.removeAll(List.of("Hayate","CBR")); this will remove these elements
//        gadiKiList.retainAll(List.of("Add all elements which you want to retain , dot add which you want to remove"))
//        gadiKiList.clear(); -- this will clear all the array
        gadiKiList.sort(Comparator.naturalOrder());
        System.out.println(gadiKiList);

        var gadiArray = gadiKiList.toArray(new String[gadiKiList.size()]);
        System.out.println(Arrays.toString(gadiArray));

        gadiArray[1] = "Helli im, new";
        System.out.println(Arrays.toString(gadiArray));
        System.out.println(gadiKiList);
    }

}
