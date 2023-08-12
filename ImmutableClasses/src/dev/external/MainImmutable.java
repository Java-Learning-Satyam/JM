package dev.external;

import dev.lpa.PersonImmutable;

public class MainImmutable {

    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("Jane", "01/01/1930");
        PersonImmutable jim = new PersonImmutable("Jim", "02/02/1932");
        PersonImmutable joe = new PersonImmutable("Joe", "03/03/194");

        PersonImmutable[] johnsKids = {jane, jim, joe};
        PersonImmutable john = new PersonImmutable("John", "05/05/1900", johnsKids);

        System.out.println(john);


        PersonImmutable[] kids = john.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Piyush" , "17/7/1028");
        System.out.println(john);

        johnsKids[0] = new PersonImmutable("Ann", "12/03/1935");
        System.out.println(john);
    }
}
