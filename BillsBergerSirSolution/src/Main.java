public class Main {
    public static void main(String[] args) {
//        Item coke =new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Toping","Avacado",1);
//        avacado.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addTopings("BACON","CHEESE","MAYO");
//        burger.printItem();
//        MealOrder regular = new MealOrder();
//        regular.addBurgerToppings("BACON","CHEES","MAYO");
//        regular.setDrinkSize("LARGE");
//        regular.printItemizedList();
        MealOrder delux = new MealOrder("delux","fanta","chili");
        delux.addBurgerToppings("Avacado", "Bacon", "Lettuce","Cheese","Mayo");
        delux.setDrinkSize("SMALL");
        delux.printItemizedList();

    }
}
