package p1;

public class Test6 {
    static int a = 10;

    public static void main(String[] args) {
       Bank b = new Bank();
        System.out.println(b.bankName);
        System.out.println(b.eid);
        System.out.println(a);
        b.printHoliday();
    }
}
class Bank {
    static String bankName = "SBI";
           int eid = 101;
    public static void printHoliday() {
        System.out.println("Monday");
    }
    public int getId(){
        return eid;
    }
}
