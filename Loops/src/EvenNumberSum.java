public class EvenNumberSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }
    public static int getEvenDigitSum(int number) {

        int even = 0;
        int numVal = number;
        int Digit = 0;

        if (numVal < 0) {
            return -1;
        }

        while (numVal > 0) {

            Digit = (numVal % 10);
            if (Digit % 2 == 0) {
                even += Digit;
            }
            numVal = numVal / 10;
//            System.out.println(Digit);
        }
        return even;
    }
}
