import java.util.*;

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        placesToVisit.addFirst(new Place("Sidney",0));
        Place place = new Place(null,0);

        addPlaces(placesToVisit,place);
        placesToVisit.sort(Comparator.comparingInt(Place::distance));
        System.out.println(placesToVisit);

        ListIterator<Place> lis = placesToVisit.listIterator();
        boolean on_of = true;
        boolean forward = true;
        printMessage();

        while (on_of) {
            if (!lis.hasPrevious()){
                System.out.println("Originating : " + lis.next());
                forward = true;
            }
            if (!lis.hasNext()){
                System.out.println("final : " + lis.previous());
                forward = false;
            }
            System.out.println("Enter Value:- ");
            switch (scanner.nextLine().toUpperCase().charAt(0)){
                case 'F' -> {
                    System.out.println("User want's to go forward");
                    if (!forward){
                        forward = true;
                        if (lis.hasNext()) {
                            lis.next();
                        }
                    }
                    if (lis.hasNext()) {
                        System.out.println(lis.next());
                    }
                }
                case 'B' -> {
                    System.out.println("User want's to go backwards");
                    if (forward){
                        forward = false;
                        if (lis.hasPrevious()) {
                            lis.previous();
                        }
                    }
                    if (lis.hasPrevious()) {
                        System.out.println(lis.previous());
                    }
                }
                case 'L' -> System.out.println(placesToVisit);
                case 'M' -> printMessage();
                default -> {
                    System.out.println("quit");
                    on_of = false;
                }
            }
        }
//

    }
    private static void addPlaces(LinkedList<Place> list, Place place){

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }
        list.add(new Place("Adelaide",1374));
        list.add(new Place("Alice Spring",2771));
        list.add(new Place("Brisbane",917));
        list.add(new Place("Darwin",3972));
        list.add(new Place("Melbourne",877));
        list.add(new Place("Perth",3923));
    }


    private static void printMessage() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit """);
    }
}



