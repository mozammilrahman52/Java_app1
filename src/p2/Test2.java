package p2;

public class Test2 {
    public static void main(String[] args) {
        int a1 = 20;
            a1+=10;
        System.out.println("Compound operator(+=,-=,*=):"+a1);
       float f = 45.5f;
             f*=a1;
        System.out.println("Conpound operator*=:"+f);
          f-=500;
        System.out.println("f-=:" +f);
        int a = 10 + 40;  //(+,-,*,/,%)
        System.out.println("Arithmetic operator:"+a);

        int a2 = 5*1-20/2;
        System.out.println(a2);
        byte b = 50;
        byte b1= 55;
        byte b2=(byte) (b+b1);
        System.out.println("Typecast:"+b2);
        long l = 500;
        int i =(int) l;
        System.out.println(i);
        int i1 = Integer.MAX_VALUE;
        System.out.println(i1);
        int i2 = Integer.MIN_VALUE;
        System.out.println(i2);
        int i3 = 500;
        byte b3 =(byte)i3;
        System.out.println(b3);

    }
}
