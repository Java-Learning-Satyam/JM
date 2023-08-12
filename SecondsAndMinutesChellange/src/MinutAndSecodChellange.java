public class MinutAndSecodChellange {
    public static void main(String[] args) {
    System.out.println(getDurationString(3945));
    System.out.println(getDurationString(65,45));

    }
    public static String getDurationString (int seconds) {
      // this method is taking second and returning hour , min , reaning second
        int minut = seconds / 60;
        return getDurationString(minut,seconds);
    }
    public static String getDurationString (int minuts ,int seconds) {

        int hour = minuts / 60;
        int remaningmin = minuts % 60;
        int remaninsec = seconds % 60;
        System.out.println(hour + "h " + remaningmin + "m " + remaninsec + "s");
        return "";
    }
}
