package dev.anithing;

enum UtilityType {
    ELECTRICAL, FIBER_OPTIC, WATER, GAS;
}
public class UtilityLine implements Mappable{

    private String Name;
    private UtilityType usage;

    public UtilityLine(String Name, UtilityType usage) {
        this.Name = Name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return Name + " (" + usage + ")";
    }

    @Override
    public Geometry getGeometryType() {
        return Geometry.LINE;
    }

    @Override
    public String getIconType() {
        return switch (usage) {
            case ELECTRICAL -> Color.RED + " " + LightMarkers.DASHED;
            case FIBER_OPTIC -> Color.BLUE + " " + LightMarkers.DASHED;
            case WATER -> Color.BLUE + " " + LightMarkers.SOLID;
            case GAS -> Color.RED + " " + LightMarkers.SOLID;
            default -> Color.BLACK + " " + LightMarkers.DOTTED;
        };
    }

    @Override
    public String JSON() {
        return Mappable.super.JSON() + """
                , "name": "%s", "utility": "%s" """.formatted(Name,usage);
    }
}
