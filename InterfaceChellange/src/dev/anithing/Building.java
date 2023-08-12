package dev.anithing;

enum UsageType {BUSINESS, ENTERTAINMENT,RESIDENTIAL,SPORTS}
public class Building implements Mappable {

    private String buildingName;
    private UsageType buildingType;

    public Building(String buildingName, UsageType buildingType) {
        this.buildingName = buildingName;
        this.buildingType = buildingType;
    }

    @Override
    public String getLabel() {
        return buildingName + " (" + buildingType + ")";
    }

    @Override
    public Geometry getGeometryType() {
        return Geometry.POINT;
    }

    @Override
    public String getIconType() {
        return switch (buildingType) {
            case ENTERTAINMENT -> Color.RED + " " + PointMarkers.TRIANGLE;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
            case SPORTS -> Color.GREEN + " " + PointMarkers.DIAMOND;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };
    }

    @Override
    public String JSON() {
        return Mappable.super.JSON() + """
                , "name": "%s", "usage": "%s" """.formatted(buildingName,buildingType);
    }
}
