package pattern;

public class p11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n-1; i>=0; i--){

            for (int space=0; space<n-i-1;space++){
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
