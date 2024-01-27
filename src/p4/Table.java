package p4;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++){

            for (int j=1; j<=10; j++){

                System.out.println(i+ " * " + j + " = " +i*j);

            }
            System.out.println();
        }

    }
}
//    int start = 1;
//    int end = 5;
//
//        for (int num = start; num <= end; num++) {
//                System.out.println("Multiplication table for " + num + ":");
//                for (int i = 1; i <= 10; i++) {
//                int result = num * i;
//                System.out.println(num + " x " + i + " = " + result);
//                }
//                System.out.println();
//                }