public class Sum3And5 {
    public static void main(String[] args) {
        int num = 0, counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if((i % 3 ==0) && (i % 5 == 0)) {
                num = num + i ;
                counter ++;
                System.out.println("The number is  " + i);
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("The sum of numbers is "+ num);
    }
}
