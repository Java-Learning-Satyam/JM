import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseCopy(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverseCopy(int[] array) {
        System.out.println("Array = "  + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        System.out.println("Reversed = " + Arrays.toString(reversedArray));
    }
}
