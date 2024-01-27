package p2;

import java.util.Scanner;

public class Test6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int sum =0;
        int copy=num;
        while(num>0){
            int r = num%10;

            sum = sum*10 + r;
            num = num/10;
        }
        if(copy==sum){
            System.out.println("p");
        }else{

            System.out.println("Not");
        }
    }
}
