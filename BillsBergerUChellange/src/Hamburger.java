public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        System.out.println(name + " hamburger on a " + breadRollType + " rool with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1 (String name,double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2 (String name,double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition3 (String name,double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition4 (String name,double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizeHamburger() {
        return price;
    }
}
