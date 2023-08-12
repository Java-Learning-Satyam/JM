import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] first = getRandomArray(10);
        System.out.println(Arrays.toString(first));
        Arrays.sort(first);

//        int[] newArray = Arrays.copyOf(first, first.length);
        int[] newArray = Arrays.copyOf(first, 5);
        for(int i = (first.length -1) ; i > 0; i--){
            System.out.print(first[i] + " ");
        }
    }


    public static int[] getRandomArray(int len){
        int[] intArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(1000);
        }
        return intArray;
    }
}
