package Thread;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

class myTimeTask extends TimerTask {
    int k = 0;

    @Override
    public void run() {
        System.out.println(k++ + "times");
        Toolkit tool = Toolkit.getDefaultToolkit();
        tool.beep();
    }
}
public class extime {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new myTimeTask(), 1000, 2000);
    }
}
