package Internet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TalkClient {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("localhost", 1234);
        DataInputStream din = new DataInputStream(s1.getInputStream());
        final DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        Frame myframe = new Frame("简易聊天室");
        Panel panel = new Panel();
        final TextField input = new TextField(20);
        TextArea display = new TextArea(5, 20);
        panel.add(input);
        panel.add(display);
        myframe.add(panel);
        new receiveThread(din, display);
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dos.writeUTF(input.getText());
                }catch (IOException x){};
            }
        });
        myframe.setSize(300, 300);
        myframe.setVisible(true);
    }
}

class receiveThread extends Thread {
    DataInputStream dis;
    TextArea displayarea;

    public receiveThread(DataInputStream dis, TextArea m) {
        this.dis = dis;
        this.displayarea = m;
        this.start();
    }

    @Override
    public void run() {
        for (;;) {
            try {
                String str = dis.readUTF();
                displayarea.append(str + "\n");
            }catch (IOException e){}

        }
    }
}
