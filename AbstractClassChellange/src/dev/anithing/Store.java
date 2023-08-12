package dev.anithing;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}
public class Store {

    private static ArrayList<ProductForSale> orderNow = new ArrayList<>();

    public static void main(String[] args) {
        orderNow.add(new Dairy("Milk",70,"Freshly packed directly form farm in jodhpur"));
        orderNow.add(new Dairy("chees",480,"A quality product from amoul"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemTOrder(order1,1,2);
        addItemTOrder(order1,0,1);
        printOrder(order1);
    }

    public static void listProducts(){
        for (var item : orderNow){
            System.out.println("-".repeat(30));
            item.showDetail();
        }
    }

    public static void addItemTOrder(ArrayList<OrderItem> order, int orderIndex,
                                     int qty) {
        order.add(new OrderItem(qty, orderNow.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = Rs %6.2f %n", salesTotal);
    }
}
