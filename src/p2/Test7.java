package p2;

public class Test7 {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int sum =0;
        while (num>0){
            int r = num%10;
            sum = sum + r*r*r;
            num = num/10;
        }
        if(copy==sum){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not");
        }
    }
}
