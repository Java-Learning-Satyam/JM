public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal","huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog =new Dog();
        doAnimalStuff(dog,"Fast");

        Dog yourkie = new Dog("Yourkie", 15);
        doAnimalStuff(yourkie,"Fast");

        Dog retriver =new Dog("Labrador Retriver" , 65);
        doAnimalStuff(retriver, "Fast");

    }

    public static void doAnimalStuff(Animal animal , String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");

    }
}
