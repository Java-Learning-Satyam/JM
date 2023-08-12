public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        int count = 1;
        int factorSum = 0;
        if (number < 1) {
            return false;
        }
        int num = number/2;
        while (count <= num) {
            if (number % count == 0) {
                System.out.println(count);
                factorSum += count;
            }
//            System.out.println("An iteration");
            count ++;
        }
//        factorSum -= number;
        System.out.println(factorSum);
        System.out.println(number);
        return  (factorSum == number);


    }
}
