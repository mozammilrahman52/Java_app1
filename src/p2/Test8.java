package p2;

public class Test8 {
    public static void main(String[] args) {
        int num = 121;
        int sum = 0;
       // int copy = num;
        for(int i=num; i>0; i=i/10){
            int r = i%10;
            sum = sum*10+ r;
        }
        if(num==sum){
            System.out.println("palindrome");
        }else {
            System.out.println("Not");
        }
    }
}
