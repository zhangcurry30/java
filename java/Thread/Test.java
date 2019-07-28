package Thread;

public class Test {
    public static void main(String[] args) {
        Bridge b = new Bridge();
        personPassBridge x;
        for (int i = 1; i <= 4; i++) {
            x = new personPassBridge("南边，第" + i + "人", b);
            x.start();
        }
        for (int i = 1; i <= 3; i++) {
            x = new personPassBridge("北边，第" + i + "人", b);
            x.start();
        }
    }
}