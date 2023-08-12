package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = new int[10];
        integerArray[5] = 50;

        double[] mydoubleArray = new double[5];
        mydoubleArray[3] = 3.5;
        System.out.println(mydoubleArray[3]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength =firstTen.length;
        System.out.println("length of array  = " + arrayLength);
        System.out.println("last  = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray =new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("");
        for(int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println( );
        System.out.println(Arrays.toString(newArray));
        Object objectVar = newArray;
        if (objectVar instanceof int[]) {
            System.out.println("ObjectVar is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
    }
}
