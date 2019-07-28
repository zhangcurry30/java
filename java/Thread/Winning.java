package Thread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Winning extends Frame implements Runnable {
    String[] phoneNumber = {"1503231", "9516131", "265441981", "156" +
            "5"};
    TextArea disp = new TextArea();
    int pos = 0;
    boolean flag;
    Button onoff;

    public static void main(String[] args) {
        new Winning();
    }

    public Winning() {
        add("Center", disp);
        onoff = new Button("begin");
        add("South", onoff);
        onoff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("begin")) {
                    flag = true;
                    onoff.setLabel("end");
                    (new Thread(Winning.this)).start();
                } else {
                    flag = false;
                    onoff.setLabel("begin");
                }
            }
        });
        setSize(200, 100);
        setVisible(true);
    }

    public void run() {
        while (flag) {
            int n = phoneNumber.length;
            pos = (int)(Math.random() * n);
            String messsage = phoneNumber[pos] + "\n" + phoneNumber[(pos + 1) % n];
            disp.setText(messsage);
        }
    }
}
