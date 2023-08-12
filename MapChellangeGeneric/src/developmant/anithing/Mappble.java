package developmant.anithing;

public interface Mappble {
    void render();
    static double[] StringToLatLong (String location) {

        var split = location.split(",");
        double lat = Double.valueOf(split[0]);
        double lng = Double.valueOf(split[1]);
        return new double[]{lat,lng};
    }
}
