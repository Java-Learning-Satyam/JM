public class UdemyChellange {
    public static void main(String [] args) {
//   System.out.println(toMilesPerHour(10.25d));
    printconverson(10.25d);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long rounded;
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            rounded = Math.round(kilometersPerHour / 1.609);
        }
        return rounded;
    }

    public static void printconverson(double kilometerPerHour) {
       if (kilometerPerHour < 0 ){
           System.out.println("invalid value");
       } else {
           System.out.println(kilometerPerHour + "Km/h=" + toMilesPerHour(kilometerPerHour) + "mi/h");
       }
    }
}
// alternative
//public class SpeedConverter {
//
//    public static long toMilesPerHour(double kilometersPerHour)  {
//        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour)  {
//        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//    }
//
//}