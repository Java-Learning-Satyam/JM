public class FirstAndLastDigitSum {
        public static void main(String[] args) {
            System.out.println(sumFirstAndLastDigit(-5));
        }
        public static int sumFirstAndLastDigit(int number) {

            if (number < 0) {
                return -1;
            }

            int reverse = 0;
            int lastDigit = 0, firstDigit = 0;
            int numVal = number;
            int count = 1;

            while (numVal > 0) {

                if (count == 1) {
                    lastDigit = (numVal % 10);
                }
                if (numVal <= 9) {
                    firstDigit = numVal;
                }
                numVal = numVal / 10;
                count ++;
            }
            return (firstDigit + lastDigit);
        }
    }


