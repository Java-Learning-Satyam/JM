package dev.anithing;

public class Dairy extends ProductForSale {


    public Dairy(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetail() {
        System.out.println("Be assured (" + type + ") is an Anithing safe product ");
        System.out.printf("The price of the price is Rs%6.2f %n",price);
        System.out.println(description);
    }
}
