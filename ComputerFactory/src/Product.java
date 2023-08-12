public class Product {
    private String model;
    private String manifacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manifacturer) {
        this.model = model;
        this.manifacturer = manifacturer;
    }
}
class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manifacturer) {
        super(model, manifacturer);
    }

    public Monitor(String model, String manifacturer,
                   int size, String resolution) {
        super(model, manifacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt (int x, int y, String color) {
        System.out.println(String.format(
                        "Drawing pixcel at %d,%d in color %s ",x,y, color));
    }
}
class MotherBord extends Product {

    private int ramSlot;
    private int cardSlot;

    public MotherBord(String model, String manifacturer, int ramSlot, int cardSlot,
                      String bios) {
        super(model, manifacturer);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram (String programName ){
        System.out.println("Program " + programName + " is now  Loading...");
    }
    private String bios;

    public MotherBord(String model, String manifacturer) {
        super(model, manifacturer);
    }
}
class ComputerCase extends Product {
    private String powerSupply;

    public ComputerCase (String model, String manifacturer) {
        super(model, manifacturer);
    }
    public ComputerCase (String model , String manifacturer ,String powerSupply) {
        super(model ,manifacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}