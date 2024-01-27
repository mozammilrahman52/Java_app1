package p5;

import java.util.Scanner;

public class SumDiagonalInMatrix {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numRows = 3;
            int numCols = 3;
            int[][] matrix = new int[numRows][numCols];
            System.out.println("Enter the elements of the matrix:");
            // Input the elements of the matrix
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            scanner.close();
            System.out.println("Matrix:");
            // Display the matrix
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            int mainDiagonalSum = 0;
            int secondaryDiagonalSum = 0;
            // Calculate the sum of the main and secondary diagonals
            for (int i = 0; i < numRows; i++) {
                mainDiagonalSum += matrix[i][i];  // Add element at (i, i) for main diagonal
                secondaryDiagonalSum += matrix[i][numCols - i - 1];  // Add element at (i, numCols - i - 1) for secondary diagonal
            }
            // Display the sums
            System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
            System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        }
}
