public class NumberPalindrme {
    public static void main(String[] args) {
        System.out.println(isPalindrome(112112));
    }
    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int lastDigit = 0;
        int numVal = number;

        while (numVal > 0) {

            lastDigit = (numVal % 10);
            reverse = (reverse * 10) + lastDigit;
            numVal = numVal / 10;
        }
//        System.out.println(number + " - number " + " reverse - " + reverse + " Last digit " + lastDigit);

        if (number == reverse){
            return true;
        } else {
            return false;
        }
    }
}
