package developmant.anithing;

public class Main {
    public static void main(String[] args) {
        var parkNearMe = new Park[] {
          new Park("Bachha","26.258004564246495, 72.95851663745617"),
          new Park("Park MahaveerPuram","26.25873100314762, 72.95995430134914"),
          new Park("Ashok Udhiyan","26.249781769475785, 72.97647357303566")
        };
        Layer<Park> parkLayer = new Layer<>(parkNearMe);
        parkLayer.renderLayer();

        var RiverNearMe = new River[] {
                new River("Luni","25.832752439607834, 72.0073091475923","25.85832562975966, 72.78624202097234","26.222317636844473, 73.6909519020406"),
                new River("Ganga","25.447319393078494, 83.54551480393971")
        };
        Layer<River> riverLayer = new Layer<>(RiverNearMe);
        riverLayer.renderLayer();
    }
}
