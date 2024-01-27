package p2;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();

         for (int i=1; i<=n/2; i++) {
             int c = i * i;
             if (c == n) {
                 System.out.println("Number has a square:" + i);
                 break;
             } else if (c > n) {
                 System.out.println("Number does not square:" + n);
                  break;
             }

         }
    }
}
