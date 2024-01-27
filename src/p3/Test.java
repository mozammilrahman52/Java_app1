package p3;

public class Test {
    public static void main(String[] args) {
        //String to integer
        String str = "12345";
        int a = Integer.parseInt(str) +1;
        System.out.println("String to Integer=" +a);
        System.out.println("=========");
//        integer to String 3 way we can do;
         int b = 100;
         String str1 = Integer.toString(b);
        System.out.println("Integer to String 1Method=" +str1);

        String str2 = String.valueOf(b);
        System.out.println("Integer to String 2Method=" +str2);

        String str3 = String.format("%d", b);
        System.out.println("Integer to string 3Method=" +str3);
    }
}
