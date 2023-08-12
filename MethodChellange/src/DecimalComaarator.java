public class DecimalComaarator {
    public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }
    public static boolean areEqualByThreeDecimalPlaces(double val1 ,double val2) {
        val1 = (int)(val1 * 1000);
        val2 = (int)(val2 * 1000);

        if ((val1 - val2) == 0 ){
            return true;
        } else{
            return  false;
        }
    }
}
