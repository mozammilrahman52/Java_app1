package p4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
             int f = 1;

        for (int i=1; i<=num; i++){
              f= f*i;
        }
        System.out.println(num+"! = " +f);



    }
}
