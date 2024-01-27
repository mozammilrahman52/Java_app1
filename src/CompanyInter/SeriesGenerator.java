package CompanyInter;
 //1,2,3,4,5,8,7,16//what are the value of 9th 10th position and then WAP.
 public class SeriesGenerator {
     public static void main(String[] args) {
         int n = 10;
         int[] seq = new int[n];
         seq[0] = 1;
         for (int i = 1; i < n; i++) {
             if (i % 2 == 0) {
                 seq[i] = seq[i - 1] * 2;
             } else {
                 seq[i] = seq[i - 1] + 1;
             }
         }
         printSeries(seq);
     }

     private static void printSeries(int[] seq) {
         for (int i = 0; i < seq.length; i++) {
             System.out.print(seq[i]);

             // Add a comma and space except for the last element
             if (i < seq.length - 1) {
                 System.out.print(", ");
             }
         }
     }
 }


