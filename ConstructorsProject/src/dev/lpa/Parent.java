package dev.lpa;

public class Parent {

    static {
        System.out.println("Parent static initializer: class being constructed");
    }
    private final String name;
    private final String dob;
    protected final int siblings;
    {
//        name = "Satyam";
//        dob = "17/07/2003";
        System.out.println("In the initializer block");
    }

//    public Parent() {
//        System.out.println("Paren no args constructors");
//    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("In parent constructor ");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' + ", dob " + dob + '\'';
    }
}
