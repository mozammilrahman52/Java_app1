package mock2;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import mock1.E;

public class B implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        Thread t = new Thread(b1);
        Thread t1 = new Thread(b2);
        t.start();
        t1.start();     //wait();,notifyAll,notify,sleep
        try {
            t.join();
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        for (int i=0; i<100; i++){
            System.out.println("main");
        }
    }
}
