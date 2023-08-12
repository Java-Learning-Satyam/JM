import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

    public static void main(String[] args) {
        new SortMountains().go();
    }
    LinkedList<Mountain> mnt = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return (two.height - one.height);
        }
    }

    public void go() {
        mnt.add(new Mountain("Longs", 14255));
        mnt.add(new Mountain("Elbert", 14433));
        mnt.add(new Mountain("Maroon", 14156));
        mnt.add(new Mountain("Castle", 1465));

        System.out.println("as enterd:\n" + mnt);
        NameCompare nc = new NameCompare();
        Collections.sort(mnt,nc);
        System.out.println("by name:\n" + mnt);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mnt,hc);
        System.out.println("by height:\n" + mnt);
    }
}

class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}

