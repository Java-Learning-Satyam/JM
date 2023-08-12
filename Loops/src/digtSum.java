public class digtSum {
    public static void main(String[] args) {
        System.out.println(digirSum(1234));
        System.out.println(digirSum(-1234));
        System.out.println(digirSum(4));
        System.out.println(digirSum(32123));
    }
    public static int digirSum(int number) {

        int answer = 0;

        if (number < 0) {
            return -1 ;
        }
        while (number > 9) {
            answer += (number % 10);
            number = number / 10;
        }
        answer += number;
        return answer;
    }
}
