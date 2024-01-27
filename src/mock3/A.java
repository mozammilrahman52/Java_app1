package mock3;

public class A extends Thread{// run(), start()
   @Override
   public void run(){
       for (int i=0; i< 100; i++){
           System.out.println("run");
       }
   }

    public static void main(String[] args) {
        A a1 = new  A();
        A a2 = new  A();
        a1.start();
        a2.start();
        for (int i=0; i<100; i++){
            System.out.println("main");
        }
    }
}
