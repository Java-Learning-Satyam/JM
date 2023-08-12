package dev.lpa;

public class Main {

    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        jim.setName("Joe");
//        Person john = new Person();
//        john.setName("John");
//        john.setName("05/05/1975");
//        john.setKids(new Person[]{jane, jim, john});
//        System.out.println(john);

        Person jane = new Person("Jane", "01/01/1930");
        Person jim = new Person("Jim", "02/02/1932");
        Person joe = new Person("Joe", "03/03/194");

        Person[] johnsKids = {jane, jim, joe};
        Person john = new Person("John", "05/05/1900", johnsKids);

        System.out.println(john);
        john.setKids(new Person[]{new Person("Ann", "04/04/1930")});
        System.out.println(john);

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john);

        kids = null;
        System.out.println(john);

        john.setKids(kids);
        System.out.println(john);

    }
}
