package p1;

public class Test3 {
    int a = 20;
    public static void main(String[] args) {
        int a = 10;
        char c = 'A';
        String str ="Mozammil";
        float f = 54.5f;
        boolean b = true;
        Salary(a,c,str,f,b);
        Test3 t = new Test3();
        t.getName("Md Mozammil Rahman");
        t.getBalance();
        int val = t.WithDrawMoney();
        System.out.println("return employeeSalary= " +val);
    }
    static void Salary(int a,char c,String str,float f,boolean bool){
        System.out.println(a);
        System.out.println(c);
        System.out.println(str);
        System.out.println(f);
        System.out.println(bool);
    }
    public void getName(String str){
        System.out.println("Name= " +str);
        System.out.println("============================");
        getLoan();
    }
    public void getLoan(){
        int loan = 6000;
        System.out.println("loan= " +loan);
    }
    public void getBalance(){
        System.out.println("a= " +a);
    }
    public int WithDrawMoney(){
        int employeeSalary = 3999;
        return employeeSalary;
    }
}
