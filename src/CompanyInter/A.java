package CompanyInter;
//volatile singleton class// double-checked looking.
public class A {
    private static volatile A a;

    private A(){

    }
    public static A getInstance(){
        if(a==null){
            synchronized (A.class){
                if(a == null){
                    a = new A();
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        A a1 = getInstance();
        A a2 = getInstance();
        System.out.println(a1);
        System.out.println(a2);
    }
}
