package p2;

public class Test12 {
    public static void main(String[] args) {
        int num = 42081;
        int rev = 0;
        while (num>0){
            int r = num%10;
            rev = rev*10 +r;
            num = num/10;
        }
        System.out.println(rev);
        System.out.println("===========");
        Test12 a = new Test12();
        a.reverse();
    }
    public void reverse(){
        int num = 501932;
        int sum = 0;
        for (int i=num; i>0; i=i/10){
            int r = i%10;
            sum = sum*10 +r;
        }
        System.out.println(sum);
    }


}
