public class LeeapYearCalculator {
    public static void main(String[] args) {
    System.out.println(isLeapYear(1600));
    }
    public static boolean isLeapYear (int year) {
        boolean isOrNot = false;
        if (year < 1 && year < 999) {
            isOrNot = false;
        } else if ((year % 100 == 0 && year % 400 ==0) && year % 4 == 0) {
            isOrNot = true;
        } else {
            isOrNot = false;
        }
        return isOrNot;

    }
}
