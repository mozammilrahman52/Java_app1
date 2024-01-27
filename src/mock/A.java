package mock;

public class A {
    private static A a1;

    private A(){

    }
    public static A getInstance(){
        if(a1 == null){
            a1 = new A();
        }
        return a1;
    }
    public void getSalary(){
        System.out.println(150000);
    }

    public static void main(String[] args) {
        A a1 = getInstance();
        A a2 = getInstance();
        A a3 = getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        a1.getSalary();
    }
}
