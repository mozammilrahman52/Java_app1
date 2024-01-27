package array;

public class LongestIncreasingOfSubarray {
    public static void main(String[] args) {
        int x[] = {1,3,5,8,2,9,6,7,9,15,20,22,25,4,35,1};
        int lengthOf = 1;
       int maxLength = 1;
        for (int i=1; i<x.length; i++){
              if(x[i-1]<x[i]){
                  lengthOf++;
              }else {
                  lengthOf = 1;
              }
            
            System.out.println(lengthOf);
                 maxLength = Math.max(lengthOf,maxLength);
        }
        System.out.println(maxLength);
    }
}
