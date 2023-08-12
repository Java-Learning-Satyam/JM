public class TeenNumChecker {
    public static void main(String[] args) {
    System.out.println(hasTeen(9,99,19));
    System.out.println(isTeen(9));
    }
//    public static boolean hasTeen (int a , int b, int c) {
//        return (((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) || (c >= 13 && c <= 19) );
//    }
//
//    public static boolean isTeen(int a) {
//        return (a>=13 && a<=19);
//    }

//     alternative you can do like this checking each value by calling the next function which check each value thank you komtic

    public static boolean hasTeen(int nr1, int nr2, int nr3){
        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
    }

    public static boolean isTeen(int nr1){
        return (nr1 >= 13 && nr1 <= 19);
    }

}
