package pattern;

public class p19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            for (int i=n; i>=0; i--){

                for (int space=0; space<i; space++){
                    System.out.print(" ");
                }
                for (int j=0; j<n-i; j++){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
