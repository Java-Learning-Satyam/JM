public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(119));
    }

    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;
        for(int i = number-1; i >= 2; i--) {
//            System.out.println(number);
//            System.out.println("this is -"+i);
            if(number % i == 0) {
                number = i;
//                System.out.println("this is in "+i);
            }
        }
        return number;
    }
}
