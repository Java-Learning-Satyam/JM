public class GratestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGratestCommonDivisor(9,18));
    }

    public static int getGratestCommonDivisor(int num1, int num2) {

        int count = 1;
        int numGrater = num2;
        int no1Divisor = 0, no2Divisor = 0;
        int common = 1;
        int gratest = 1;

        if (num1 < 10 || num2 < 10) {
            return -1;
        }
        if(num1 > num2){
            numGrater = num1;
        }
        while (count <= numGrater) {
            if (num1 % count == 0) {
//                System.out.println(count);
                no1Divisor = count;
            }
            if (num2 % count == 0){
//                System.out.println(count);
                no2Divisor = count;
            }
            if (no1Divisor == no2Divisor) {
                common = no1Divisor;
//                System.out.println("Found a Common number " + common);
            }
            if (gratest < common) {
                gratest = common;
            }
//            System.out.println("An iteration");
            count ++;
        }
        return gratest;
    }
}
