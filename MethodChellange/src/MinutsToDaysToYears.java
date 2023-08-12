public class MinutsToDaysToYears {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        long hour = minutes / 60;
        long days = hour / 24;
        long year = days / 365;
        long remaningdays = days % 365;

        System.out.println(minutes + " min = " + year + "y" + " and " + remaningdays + " d");
    }
}
