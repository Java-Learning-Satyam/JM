package developmant.anithing;

import java.util.Arrays;

abstract public class Point implements Mappble{

    public Point(String location) {
        this.location = Mappble.StringToLatLong(location);
    }
    private double[] location = new double[2];

    @Override
    public void render() {
        System.out.println("Render " + this + " as a POINT (" + location() + ")");
    }

    public String location() {
        return Arrays.toString(location);
    }

    @Override
    public String toString() {
        return "";
    }
}
