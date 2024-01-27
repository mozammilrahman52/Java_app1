package p2;

public class Test10 {
    public static void main(String[] args) {
        for(int i=11; i<=200; i++){
            int copy = i;
            int sum =0;

            while (copy>0){
                int r = copy%10;
                sum = sum*10 +r;
                copy=copy/10;
            }
            if(i==sum){
                System.out.println(i+" ");
            }
        }
    }
}
