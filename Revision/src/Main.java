import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

// Program that show distance of diff district from jodhpur in natural Order
record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("Lo bai sa -- %s (%d) \n",name,distance);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Place> nam_Kitni_Distance = new ArrayList<>();
        ArrayList<kehaJanaHai> nam_Kitni_Distance_add = new ArrayList<>();

        nam_Kitni_Distance.add(new Place("Pali",64));
        nam_Kitni_Distance_add.add(new kehaJanaHai("jasilmer",281));

        nam_Kitni_Distance.add(new Place("Phalodi",144));
        nam_Kitni_Distance.add(new Place("Sri Ganganagar",499));
        nam_Kitni_Distance.add(new Place("Jaipur",333));
        nam_Kitni_Distance.add(0,
                new Place("Udaipur",248));

        System.out.println(nam_Kitni_Distance);
        System.out.println(nam_Kitni_Distance_add);

//        printInOrder(nam_Kitni_Distance, new Place("Pali",64));
//        printInOrder(nam_Kitni_Distance, new Place("jasilmer",281));
//        printInOrder(nam_Kitni_Distance, new Place("Udaipur",248));
//        nam_Kitni_Distance.sort(Comparator.comparingInt(Place::distance));
    }

    public static void printInOrder(ArrayList<Place> list, Place place) {
        ListIterator<Place> iterator = list.listIterator();

        int matchIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchIndex,place);
                return;
            }
            matchIndex++;
        }
     list.add(place);
    }
}
