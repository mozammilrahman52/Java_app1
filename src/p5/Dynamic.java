package p5;

import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of arrays that is to be created");
        int row = sc.nextInt();
//        System.out.println("Enter the size of each array");
        int column = sc.nextInt();
        int a[][] =  new int[row][column];
        System.out.println("Enter the element of the array that you want") ;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                a[i][j] = sc.nextInt();
//                System.out.print(a[i][j]+" ");
            }
//            System.out.println();
        }
        System.out.print("\nData you entered : \n");
        for(int []x:a){
            for(int y:x){
                System.out.print(y+"     ");
            }
            System.out.println();
        }



    }
}
