package dev.anithing;

public class Phone implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is being tracked");
    }
}
