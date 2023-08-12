public class OddLoopChellange {
    public static void main(String[] args) {
         System.out.println(isOdd(5));
         System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd(int number){
        if (number < 0) {
            return false;
        } else return number % 2 != 0;
    }
    public static int sumOdd(int start , int end) {
        int oddSum = 0;
        if ((start > 0 && end > 0) && (end >= start) ){
            for (int i = start ; i <= end  ; i++ ){
                if (i % 2 != 0){
                    oddSum += i;
                }
            }
            return oddSum;
        } else {
            return  -1;
        }
    }
}
