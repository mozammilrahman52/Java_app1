package p5;

import java.util.Scanner;

public class SumEvenNumbersInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = 3;
        int numCols = 3;

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println("Matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int evenSum = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenSum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers in the matrix: " + evenSum);
    }
}
