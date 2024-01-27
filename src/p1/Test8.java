package p1;

public class Test8 {
    int a = 2000;

    public static void main(String[] args) {
        Test8 t = new Test8();
        t.getValue();

    }
    public void getValue(){
        Test8 t = new Test8();

        t.a = 200;
        System.out.println(a);
        getSecondValue();
    }
    public static void getSecondValue(){
        Test8 t = new Test8();
        System.out.println(t.a);
    }
}
