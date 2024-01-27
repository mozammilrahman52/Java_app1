package p2;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Test {
    String name;
    int cost = 302;
     int a = 999;
     static
     {
         System.out.println("In TEST class static block"); //1
     }
    {
        System.out.println("In Test class non-static block");//8,10
    }
    static
    {
        new BankEmplyoee();
        System.out.println("in Test class static block 2");//7
    }
    Test(){
        System.out.println("In Test class constructor");//9,11
    }
    public static void main(String[] args) {
        int a = 10;
        char b = 'A';
        char c = 65;
        String s = "Mozammil";
        boolean b1 = true;
        float b2 = 10.5f;
        serviceGroup(a, b, c, s, b1, b2, 55.55);
        Test t = new Test();
        t.employeeDetail("Mozammil",100000);
        int val = t.serviceCost();
        System.out.println("val:" +val);  //501
        int val1 = t.getLoan();
        System.out.println("val1:"+val1);  //302
        System.out.println("================");

        BankEmplyoee bank = new BankEmplyoee();
        float salary = bank.getSalary();
        System.out.println(salary);  //201
        System.out.println(bank.bankName);
        System.out.println(bank.id);

        int id = bank.getId();
        System.out.println(id);
        String s1 = bank.printHoliday();
        System.out.println(s1);
        System.out.println("##################################################################");
        Test t1 = new Test();
        System.out.println(t.a);//999
        t.a =1111;
        System.out.println(t1.a);//999
//        t.a =1111;
        t.getValue();//100
        t1.getValue();//9999
        System.out.println("================");
        int z = 10;
        bank.method(z);
        System.out.println("In main of Test:" +z);
        bank.method1(bank);
        System.out.println("In main() of Test and value of b:" +bank.v);
    }
    public void getValue(){
        a = 100;
        System.out.println(a);
        getSecondValue();//100/999
    }
    public void getSecondValue(){
        System.out.println("a=" +a);
    }
    public static void serviceGroup(int a, char b, char r, String str, boolean bool, float f, double d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
        System.out.println(bool);
        System.out.println(f);
        System.out.println(d);
        System.out.println("======================");
    }
    public void employeeDetail(String name,int cost){
        System.out.println(name);
        System.out.println(cost);
    }
    public int getLoan(){
//        cost = 111;
//        System.out.println(cost);
        return cost;
    }
    public int serviceCost(){
        int cost = 501;
        System.out.println(cost);  //501

        return cost;
    }

}
class BankEmplyoee{
    int id =101;
    int v = 2001;
    float salary = 201;
    static String bankName = "SBI";
    static int b;
    public float getSalary(){
//        System.out.println(salary);
        return salary;
    }
    public int getId(){
        printHoliday();
        return id;
    }
    public String printHoliday(){
        System.out.println("Monday");
        return bankName;
    }
    static {
        System.out.println("Static block in bankEmployee class");//2
    }
    {
        System.out.println("non-static block in bankEmployee class");//5
    }
    static {
        b=30;
        System.out.println("int b in BankEmployee class:" +b);//3
        System.out.println("static block of BankEmployee class 2");//4
    }
    BankEmplyoee(){
        System.out.println("Constructor in bank Employee");//6
    }
    public void method(int z){
        z = 100;
        System.out.println("Pass by value:" +z);
    }
    public void method1(BankEmplyoee bank){
       bank.v = 1010;
        System.out.println("bank=" +v);
    }
}

