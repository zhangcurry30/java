package Thread;

public class personPassBridge extends Thread {
    private Bridge bridge;      //桥对象
    String id;                  //人的标识

    public personPassBridge(String id, Bridge b){
        bridge = b;
        this.id = id;
    }

    public void run() {
        bridge.getBridge();
        System.out.println(id + "正过桥...");
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {}
        bridge.goDownBridge();
    }
}

class Bridge {
    private boolean engaged = false;        //桥的占用状态

    public synchronized void getBridge() {      //取得上桥资格
        while (engaged) {
            try {
                wait();                         //如果桥被占用就循环等待
            } catch (InterruptedException e){}
        }
            engaged = true;
    }

    public synchronized void goDownBridge() {       //下桥
        engaged = false;
        notifyAll();                                   //唤醒其他进程
    }
}



