package dev.lpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] input = readIntegers();
        System.out.println(findMin(input));
    }


    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list if int, seperated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < values.length;i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] intArray){
        int len = intArray.length;
        int min = intArray[0];
        for (int j : intArray) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
