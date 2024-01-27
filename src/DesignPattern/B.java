package DesignPattern;
//
public class B {
    private static B obj = new B();

    private B(){

    }
    public static B getB(){
        return obj;
    }

    public static void main(String[] args) {
        B b1 = getB();
        B b2 = getB();
        System.out.println(b1);
        System.out.println(b2);
    }
}
