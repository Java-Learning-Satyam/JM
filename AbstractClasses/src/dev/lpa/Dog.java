package dev.lpa;

public class Dog extends Animal {


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow"){
            System.out.println(getExplicitYpe() + " is now walking");
        } else {
            System.out.println(getExplicitYpe() + " is now running");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Kuta") {
            System.out.println("Bhou bhou");
        } else {
            System.out.println("Koi or janvar");
        }
    }

}
