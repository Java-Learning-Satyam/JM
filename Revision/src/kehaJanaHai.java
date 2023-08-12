public class kehaJanaHai {
    protected String name;
    protected int distance;

    public kehaJanaHai(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("Yea class sai aay hai %s (%d)",name,distance);
    }

}
