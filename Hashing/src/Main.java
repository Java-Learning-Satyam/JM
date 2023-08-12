import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos =
                Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        PlayingCards aceOfHarts = new PlayingCards("Hearts","Ace");
        PlayingCards kingClubs = new PlayingCards("Clubs","King");
        PlayingCards queenSpade = new PlayingCards("Spade","Queen");
//        PlayingCards queenSpade = new PlayingCards("Spade","Queen");

        List<PlayingCards> cards =
                Arrays.asList(aceOfHarts, kingClubs, queenSpade);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCards> deck = new HashSet<>();
        for (PlayingCards c : cards) {
            if (!deck.add(c)) {
                System.out.println("Found a duplicate for " + c);
            }
            System.out.println(deck);
        }
    }
}
