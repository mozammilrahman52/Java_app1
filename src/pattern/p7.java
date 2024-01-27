package pattern;

public class p7 {

    public static void main(String[] args) {
       int n = 5;
      for(int i=0; i<n; i++){

          int noOfSpace=n-i;
          for (int space=0; space<noOfSpace; space++){
              System.out.print("");
          }

        for (int j=0; j<=i; j++){
            System.out.print(" *");
        }
          System.out.println();
      }
    }

}
