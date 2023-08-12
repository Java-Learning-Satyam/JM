public class Box <T>{

    T container;

    public Box(T container) {
        this.container = container;
    }

    public void performOperation( ) {
        if (container instanceof String) {
            System.out.println(((String) container).length());
        } else if (container instanceof Integer) {
            System.out.println("Your object is of type integer");
        } else {
            System.out.println("container is of " + container.getClass().getSimpleName() + " type");
        }
    }
    public T getValue() {
        return container;
    }
}
