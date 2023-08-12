package developmant.anithing;

import java.util.Arrays;

public class Line implements Mappble{

    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for(var l : locations) {
            this.locations[index++] = Mappble.StringToLatLong(l);
        }
    }
    @Override
    public void render() {
        System.out.println("Render " + this + " as a LINE (" + location() + ")");
    }
    public String  location() {
        return Arrays.deepToString(locations);
    }

    @Override
    public String toString() {
        return "";
    }
}
