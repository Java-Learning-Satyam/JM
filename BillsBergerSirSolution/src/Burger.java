public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger( String name, double prise) {
        super("Burger", name, prise);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }


    @Override
    public double getAdjustedPrise() {
        return getBasePrise() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrise())+
                ((extra2 == null) ? 0 : extra2.getAdjustedPrise())+
                ((extra3 == null) ? 0 : extra3.getAdjustedPrise());
    }

    public double getExtraPrise(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON","HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }
    public void addTopings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING",extra1,getExtraPrise(extra1));
        this.extra2 = new Item("TOPPING",extra2,getExtraPrise(extra2));
        this.extra3 = new Item("TOPPING",extra3,getExtraPrise(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrise());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
