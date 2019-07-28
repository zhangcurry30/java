package Internet;

import java.net.InetAddress;

public class test {
    public static void main(String[] args) {
        try {
            InetAddress net = InetAddress.getLocalHost();
            System.out.println(InetAddress.getByName("baidu.com"));
        }catch (Exception e){}
    }
}
