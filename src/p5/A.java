package p5;

public class A {
//    static int x = 10;
//           int y = 100;
    public static void main(String[] args) {
//        System.out.println(x);
//        x = 35;
//        x = 40;
//        A a1 = new A();
//        A a2 = new A();
//        System.out.println(x);
//        a1.sonu();
//        System.out.println("non=" +a1.y);//
//        a1.y = 200;
//        System.out.println("non=" +a1.y);
//        System.out.println(a2.y);
        A a1 = new A();
        a1.method(100,200,300,400);

    }
//    public  void sonu(){
//        x = 55;
//        System.out.println("soun=" +x);
//    }
    public  void method(int... x){
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        int z = 10;
        System.out.println(z);
        z = 20;
        System.out.println(z);
        System.out.println(z);
        System.out.println("====================");
//        System.out.println(Math.pow(3,3));
        //Math.pow(a,b)-it will give us a^b;
//        System.out.println();
    }

}
