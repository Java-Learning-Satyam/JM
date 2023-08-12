public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));

    }
    public static boolean hasEqualSum (int a , int b ,int c) {
        int sum = a + b;
//        if (sum == c) {
//            return true;
//        } else  {
//            return false;
//        }
        return a+b == c; // alternative
   }
}
