package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preffered but unnecessary
//        Integer deprecatedBoxing = new Integer(15); // deprecated since jdk 9
        int unboxedInt = boxedInt.intValue(); //unnecassary

        // Automatic
        Integer atuoBoxed = 15;
        int atuoUnboced = atuoBoxed;
        System.out.println(atuoBoxed.getClass().getName());
//        System.out.println(atuoUnboced.getClass().getName());

        double resultUnboxed = getDoubleObject(); //obj is assined to primitive
        Double resultBoxed = getLiteralDoublePrimitive(); //wrapper assigned to val of primitive double

        Integer[] wrapper = new Integer[2];
        wrapper[0] = 50;
        System.out.println(Arrays.toString(wrapper));
        System.out.println(wrapper[0].getClass().getName());

        Character[] charWrapper = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(charWrapper));
        System.out.println(charWrapper.getClass().getName());

        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnInteger(Integer i){

        return i;
    }

    private static Integer returnAnInteger(int i) {

        return i;
    }

    private static double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
