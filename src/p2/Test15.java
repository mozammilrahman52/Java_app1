package p2;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
//        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);


        int sum = sumOfDigit();

        System.out.println("sum of digits of=" +sum);
        if(sum==9){
            System.out.println("sum of digits are 9=" +sum);
        }else {
            System.out.println("sum of digits are not 9=" +sum);
        }
    }
    public static int sumOfDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("realNumber=" +num);
        int sum = 0;
        for (int i=num; i>0; i=i/10){
            int r =  i%10;
            sum = sum + r;
        }
        return sum;
    }
}
