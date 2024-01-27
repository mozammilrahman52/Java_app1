package p2;

public class Test5 {
    public static void main(String[] args) {
        int num = 141;
        int copy = num;
        int sum = 0;
        while(num>0){
            int r = num%10;
            sum = sum*10 +r;
            num = num/10;
        }
        if (copy==sum){
            System.out.println("palindrome");
        }else {
            System.out.println("Not");
        }
    }
}
