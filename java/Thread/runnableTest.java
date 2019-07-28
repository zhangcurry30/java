package Thread;

import java.util.Calendar;

public class runnableTest implements Runnable {
    int pauseTime;
    String name;

    public runnableTest(int x, String n) {
        pauseTime = x;
        name = n;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + ": " + Calendar.getInstance().getTime());
//                System.out.println(Thread.currentThread());
                Thread.sleep(pauseTime);
            } catch (InterruptedException e){}
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new runnableTest(100, "fast"));
        t1.start();
        Thread t2 = new Thread(new runnableTest(300, "slow"));
        t2.start();
    }
}
