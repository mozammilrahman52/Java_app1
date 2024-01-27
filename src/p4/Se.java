package p4;

public class Se {
    public static void main(String[] args) {
        double x =5;
        double sum = 0;
        double term = 1;
        for (int i=0; i<=5; i++) {
            sum += term;
            term *= x;
            System.out.println("sum:" +sum);
            System.out.println("term:" +term);
            System.out.println("--------");
        }
    }
}
