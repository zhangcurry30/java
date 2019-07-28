package Internet;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(1234);
            while (true) {
                Socket s1 = s.accept();
                OutputStream s1oot = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(s1oot);
                Date d = new Date();
                dos.writeUTF("Hello World, current is:" + d);
                System.out.println("a client is connected...");
                s1.close();
            }
        }catch (IOException e){}
    }
}
