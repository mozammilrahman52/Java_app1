package p5;

import java.util.Scanner;

public class ElementPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to be create ");
        int size = sc.nextInt();
        int a [] = new int[size];
        System.out.println("Enter the element of the array that you want") ;
        for (int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value which has to be search");
           int value = sc.nextInt();
           for (int i=0; i<a.length; i++){
               if(a[i]==value){
                   System.out.println("The index of the element "+value+" is:" +i);
                     break;
               }
//               else {
//                     System.out.println("The element is not present at any index");
//               }
           }
    }
}
