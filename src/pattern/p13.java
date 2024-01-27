package pattern;

public class p13 {
    public static void main(String[] args) {
        int n=5;  //row i=2*n-1;


        for (int i=0; i<n-1; i++){

            for (int space=0; space<n-i-1; space++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=0; i--){

            for (int space=0; space<n-i-1; space++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
