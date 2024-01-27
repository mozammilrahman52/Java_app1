package mock3Interface;

public class C {
    public static void main(String[] args) {
       final String s = "Naaz";
        String s3 = "Naaz";
        String s1= new String("Naaz");
        String s2 = new String("Rubi Naaz");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s.concat("Parveen"));
        System.out.println(s==s3);//true
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
    }
}
