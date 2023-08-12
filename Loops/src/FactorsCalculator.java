public class FactorsCalculator {
    public static void main(String[] args) {
        printFactors(-1);
    }
    public static void printFactors(int number) {
        int count = 1;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        while (count <= number) {
            if (number % count == 0) {
                System.out.println(count);
            }
//            System.out.println("An iteration");
            count ++;
        }
    }
}
