package pattern;

public class p16 {

    public static void main(String[] args) {
        int n = 3; // Adjust the value of 'n' to control the height of the pattern

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
