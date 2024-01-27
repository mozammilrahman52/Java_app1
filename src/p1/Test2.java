package p1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        byte a = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        char c = sc.next().charAt(0);
         Salary(c);
    }
    static void Salary(char c){
        System.out.println(c);
    }

}
