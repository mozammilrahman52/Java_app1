package pattern;

public class p3 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<=2*5; i++){
            int c=i>5 ? 2*5-i: i;//n=5
            for(int j=0; j< c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
