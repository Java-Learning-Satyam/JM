package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

record Person (String name, String dob, Person[] kids) {

    public Person(Person p) {
        this(p.name, p.dob ,
                p.kids == null ? null : Arrays.copyOf(p.kids, p.kids.length));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {

        Person shubham = new Person("Shubham", "12/03/2003", null);
        Person piyush = new Person("Piyush", "13/04/2005", null);
        Person ranjan = new Person("Ranjan", "19/02/2003", new Person[]{shubham, piyush});
        Person ajay = new Person("Ajay", "27/06/2003", null);
        Person saumay = new Person("Saumsa", "31/01/2002", new Person[]{ajay});

        Person[] person = {shubham, piyush, saumay, ranjan, ajay};
        Person[] personCopy = person.clone();
//        Person[] personCopy = Arrays.copyOf(person, person.length);
//        Person[] personCopy = new Person[5];
//        Arrays.setAll(personCopy, i -> new Person(person[i]));
//        for (int i = 0; i < 5; i++) {
//            personCopy[i] = new Person(person[i]);
//        }
        for (int i = 0; i < 5; i++) {
            if (person[i] == personCopy[i]) {
                System.out.println("Equal Reference " + person[i]);
            }
        }
        System.out.println(person[3]);
        System.out.println(personCopy[3]);
    }
}
