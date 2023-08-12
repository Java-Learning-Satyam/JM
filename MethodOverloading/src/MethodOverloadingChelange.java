public class MethodOverloadingChelange {
    public static void main(String[] args) {
    System.out.println("5ft, 8in = " + convertToCentimeters(5,8));
    System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters (int inches) {
        return inches * 2.54;
    }
    public static double convertToCentimeters (int ft , int inche) {
        int HeightInInches = ((ft * 12) + inche);
        double centimeter = convertToCentimeters(HeightInInches);
        return centimeter;
    }

}
