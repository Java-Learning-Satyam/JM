package dev.lpa;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
//        int x = 30;
//        int y = 0;
//        System.out.println(devideLBYL(x, y));
//        System.out.println(devideEAFP(x, y));

        int x = getIntEAFP();
        System.out.println("x is : " + x);
    }

    private static int getInt() {
        return s.nextInt();
    }

    private static int getIntLBYL() {
        boolean isValid = true;
        System.out.println("Pleas enter an integer");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        System.out.println("Enter an integer: ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int devideLBYL(int x, int y) {
        return (y != 0) ? x/y : 0;
    }
    private static int devideEAFP(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
