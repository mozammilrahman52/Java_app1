package p2;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i=num1; i<=num2; i++){
            int copy = i;
            int sum = 0;

            for (int j=i; j>0; j=j/10){
                int r = j%10;
                sum = sum*10 + r;
            }
            if (i==sum){
                System.out.println(i+" ");
            }
        }
    }
}
