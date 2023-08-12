import java.util.Locale;

public class Item {
    private String type;
    private String name;
    private double prise;
    private String size = "MEDIUM";

    public Item(String type, String name, double prise) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.prise = prise;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")){
            return  size + " " + name;
        }
        return name;
    }

    public double getBasePrise() {
        return prise;
    }

    public double getAdjustedPrise() {
        return  switch (size) {
            case "SMALL" -> getBasePrise() - 0.5;
            case  "LARGE" -> getBasePrise() + 1;
            default ->  getBasePrise();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double prise) {
        System.out.printf("%20s:%6.2f%n", name, prise);
    }
    public void printItem() {
        printItem(getName(),getAdjustedPrise());
    }
}
