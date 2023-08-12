public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,9));
    }
    public static boolean hasSharedDigit(int num1 , int num2) {

        boolean isAnswer = false;
// num 10> && num <=99
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int num1LastVal = (num1 % 10);
            int num2LastVal = (num2 % 10);
            int num1Firstval = num1 / 10;
            int num2Firstval = num2 / 10;
//            12,23  2 == 3! 1 == 2! num1last == num2first , num1first == num2last.

            if (num1LastVal == num2LastVal || num1Firstval == num2Firstval || num1LastVal == num2Firstval || num1Firstval == num2LastVal ) {
                isAnswer = true;
            } else {
                isAnswer = false;
            }
        }
        return isAnswer;
    }
}
//  answer += (number % 10);
//  number = number / 10;
