package p1;

public class Test4 {
     int a = 40;
     static Test4 t = new Test4();

    public static void main(String[] args) {
        int a ;
        System.out.println("t= " +t.a);
        System.out.println(t.t);
         t.getBalance();
    }
    public void getBalance(){
        System.out.println("in getBalance");
    }
}
