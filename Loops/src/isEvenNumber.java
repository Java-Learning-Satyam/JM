public class isEvenNumber {
    public static void main(String[] args) {

        int number = 5;
        int FinishNumber = 20;
        int count = 0;
        while (number <= FinishNumber || count == 5){
            if (isEvenNumber(number)) {
                System.out.println("Even number " + count + " is "+ number);
                count ++;
            }
            number++;
        }
        System.out.println("The total number of odd ," + (FinishNumber - count) + "even numbers are found are " + count);

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
