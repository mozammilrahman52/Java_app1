package p2;

public class Test9 {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        for(int i=num; i>0; i=i/10){
            int r = i%10;
            sum = sum +(r*r*r);

        }
        if(num==sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }

    }
}
