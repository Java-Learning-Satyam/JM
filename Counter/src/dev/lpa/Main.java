package dev.lpa;


public class Main {
// every object has its own heap and threads can be suspended during execution of for loop we see only a limited number of output i previous execution
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {
    private int i;
    public void doCountdown() {
        String color = switch (Thread.currentThread().getName()) {
            case "Thread 1" -> ThreadColor.ANSI_RED;
            case "Thread 2" -> ThreadColor.ANSI_BLUE;
            default -> ThreadColor.ANSI_GREEN;
        };

        synchronized (this) {
            for (i = 10; i >0; i--) {
                System.out.println(color + Thread.currentThread().getName() +
                        ": i=" + i);
            }
        }

    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
