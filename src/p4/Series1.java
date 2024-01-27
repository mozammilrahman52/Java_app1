package p4;
import java.util.Scanner;
public class Series1 {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            double sum = calculateGeometricSeriesSum(x, n);

            System.out.println("Sum of the geometric series: " + sum);

            scanner.close();
        }

        public static double calculateGeometricSeriesSum(double x, int n) {
            double sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += Math.pow(x, i);
            }
            return sum;
        }


}
