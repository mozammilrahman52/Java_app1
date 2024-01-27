package DesignPattern;
//Singleton design pattern /synchronized
public class A {   //lazy Singleton design

    private static A a;

    private A(){

    }
    public static A getA(){
        if(a == null){
            synchronized(A.class){
                if(a == null){
                    a = new A();
                }
            }

        }
        return a;
    }

    public static void main(String[] args) {
        A a1 = getA();
        A a2 = getA();
        System.out.println("a1:" +a1);
        System.out.println("a2:"+a2);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
