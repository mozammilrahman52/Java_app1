package array;

public class LongestSequenceInArray {
    public static void main(String[] args) {
        int x[] = {10,23,1,5,4,7,8,10,19,11};
        int length = findLength(x);
        System.out.println("longest sequence in this array:" +length);
    }
    public static int findLength(int[] x){
       if (x.length==0){
           return 0;
       }
       int length = 1;
       int maxLength=1;
       for (int i=1; i<x.length; i++){
           if(x[i-1]<x[i]){
               length++;
           }else {
               length = 1;
           }
           maxLength = Math.max(length,maxLength);
       }
       return maxLength;
    }
}
