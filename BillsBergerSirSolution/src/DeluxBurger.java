public class DeluxBurger extends Burger {

    Item delux1;
    Item delux2;

    public DeluxBurger(String name, double prise) {
        super(name, prise);
    }


    public void addTopings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addTopings(extra1, extra2, extra3);
        delux1 = new Item("TOPPING", extra4,0);
        delux2 = new Item("TOPPING", extra5,0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (delux1 != null) {
            delux1.printItem();
        }
        if (delux2 != null) {
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrise(String toppingName) {
        return 0;
    }
}
