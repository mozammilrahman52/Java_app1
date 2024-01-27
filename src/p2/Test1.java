package p2;

public class Test1 {
     static Test1 t;
     static Test1 t1 = null;
    public static void main(String[] args) {
        int a = 10000;
        System.out.println("Decimal literal:"+a);
        int b = 0x1345A;
        System.out.println("HexaDecimal literal:"+b);
        int c = 0123;
        System.out.println("Octa Decimal literal:"+c);
        int d = 0b0101;
        System.out.println("Binary literal:"+d);
        float f = 34.44f;
        System.out.println("Floating point literal:"+f);
        double d1= 5445.5566d;
        System.out.println("Floating point literal in double:"+d1);
        double e = 9.9e+5;//9.9*10^5
        System.out.println("Exponential literal:"+e);
        double e1= 9.9e-5;//9.9*10^-5
        System.out.println("Exponential literal in -:"+e1);
        String str = "I have to go to the United state Insha ALLAH";
        System.out.println(str);
        System.out.println(t);
        System.out.println(t1);
        System.out.println("=============");
        Test1 t2= null;//initialization is mandatory
        System.out.println(t2);
        boolean b1 = true;
        System.out.println("Boolean literal:"+b1);
        char c1 = 'A';
        System.out.println("Character literal:"+c1);

    }
}

//Literals:-
//Integer literal:-
//        (Decimal literal-start with 1 to 9,HexaDecimal literal start with 0x and 1 to 9 use latter A to F,)
//        (Octa Decimal literal start with 0 and 1 to 7);
//Binary literal start with 0b and 0 to 1(.............2^1*2^0)
