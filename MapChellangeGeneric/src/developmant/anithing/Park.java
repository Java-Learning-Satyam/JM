package developmant.anithing;

public class Park extends Point{
    private String name;

    public Park(String name,String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " Park";
    }

    public Park(String location) {
        super(location);
    }
}
