package p1;

public class Test7 {
    int a = 200;

    public static void main(String[] args) {
        Test7 t = new Test7();
        Test7 t1 = new Test7();
        System.out.println(t.a);
        t.a = 500;
        System.out.println(t1.a);

        t.getValue();
        t1.getValue();
//        t.a = 1000;

    }
    public void getValue(){
        System.out.println(a);
    }
}
