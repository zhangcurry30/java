package Thread;

import java.util.Calendar;

public class timePrinter extends Thread {
    int pauseTime;
    String name;

    public timePrinter(int x, String n) {
        pauseTime = x;
        name = n;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
//                System.out.println(name + ": " + Calendar.getInstance().getTime());
                System.out.println(Thread.currentThread());
                Thread.sleep(pauseTime);
            } catch (InterruptedException e){}
        }
    }

    public static void main(String[] args) {
        timePrinter t1 = new timePrinter(100, "fast");
        t1.start();
        timePrinter t2 = new timePrinter(300, "slow");
        t2.start();
    }
}
