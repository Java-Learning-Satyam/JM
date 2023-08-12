package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Animal","big",100);
        Dog dog = new Dog("Kuta","medium",45);
        dog.makeNoise();
        doAnimalStuf(dog);

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(new Dog("German Shepard","Big",150));
        animal.add(new Fish("Goldfish","small",1));
        animal.add(new Fish("Barracuda","big",75));

        for (Animal animals : animal){
            doAnimalStuf(animals);
        }
    }

    private static void doAnimalStuf(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }
}
