package p1;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        int val = Salary();
       System.out.println(val);  //2000
    }
    public static int Salary(){
        int employeeSalary = 2000;
        getLoan();
       return employeeSalary;
    }
    public static void getLoan(){
        int loan = 6000;
        System.out.println("loan=" +loan);  //6000
    }
}
