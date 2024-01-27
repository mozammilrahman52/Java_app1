package p1;

public class Test5 {

    public static void main(String[] args) {
        BankEmployee bankEmployee = new BankEmployee();
        float salary = bankEmployee.getSalary();
        System.out.println("getSalary= " +salary);  //301
        salary = 1000;
        System.out.println(salary);
        float val = bankEmployee.withDrawMoney();
        System.out.println("withdraw Money= " +val);  //405
    }

}
class BankEmployee{
    int id;
    float salary1 = 201;

    public float getSalary(){
        float salary1 = 301;
        return salary1;
    }
    public float withDrawMoney(){
        float salary1 = 405;
        return salary1;
    }
}
