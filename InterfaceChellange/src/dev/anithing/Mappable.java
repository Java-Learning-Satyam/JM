package dev.anithing;

enum Geometry {LINE, POINT ,POLYGON;}
enum Color {BLACK, BLUE, GREEN, RED;}
enum PointMarkers {CIRCLE, DIAMOND, DOTTED, SQUARE,TRIANGLE;}
enum LightMarkers {DASHED, DOTTED, SOLID}
public interface Mappable {
    String JSON_PROPERTY = "\"properties\":{%s}";

    String getLabel();
    Geometry getGeometryType();
    String getIconType();

    default String JSON() {
      return """
              "type": "%s", "label": "%s", "maker": "%s" """.formatted(getGeometryType(), getLabel(), getIconType());
    }

    static void printProperties(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted((mappable.JSON())));
    }
}
