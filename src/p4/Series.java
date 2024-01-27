package p4;

import java.util.Scanner;

public class Series {//1 +x^1 +x^2 +x^3 +x^4+.......................x^n
                      //Geometric series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of x");
        System.out.println("Enter the power of n");
        int x = sc.nextInt();
        int n = sc.nextInt();//it is factorial program.

//      int x = 5;
//      int n =5;

        double sum = 0;
        double term = 1;

        for (int i = 0; i <= n; i++) {
            sum += term;//1
            term *= x;
        }

        System.out.println("Sum of the series: " + sum);



    }
}
