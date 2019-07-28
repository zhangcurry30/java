package Internet;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        InputStream sln = s.getInputStream();
        DataInputStream dis = new DataInputStream(sln);
        String message = dis.readUTF();
        System.out.println(message);
        s.close();

    }
}
