public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(reverse(-2));
        System.out.println(getDigitCount(123));

    }

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNum = reverse(number);

        for(int i = 0; i < getDigitCount(number) ; i++) {

            switch (reverseNum % 10) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("0NE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
            reverseNum /= 10;
        }
    }
    public static int reverse(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int numVal = number;

//        if (number < 0) {
//            numVal = (number * -1);
//        }

        while (numVal > 0) {

            lastDigit = (numVal % 10);
            reverse = (reverse * 10) + lastDigit;
            numVal = numVal / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        int numVal = number;
        int count = 0;

        if (numVal < 0) {
            return -1;
        }

        while (numVal > 0) {
            numVal = numVal / 10;
            count++;
        }
        return count;
    }
}
