import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Satysa");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("Satyam");
        list1.add(1234);
        list1.add(10.5);
        System.out.println(list1);

        Box<String> box = new Box("Water");
        Box<Integer> box1 = new Box<>(1234);


        System.out.println(box.getValue());
        System.out.println(box1.getValue());
        System.out.println(box.container.getClass().getSimpleName());

        box.performOperation("Satyam purohit");

        Box<Double> doubleVal = new Box<>(10.25);
        doubleVal.performOperation(12.23);
    }
}
