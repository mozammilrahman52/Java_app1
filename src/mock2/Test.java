package mock2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee1> l = new ArrayList<>();
        l.add(new Employee1("Mozammil",25,1500));
        l.add(new Employee1("Ayesha",26,300000));
        l.add(new Employee1("Naaz",28,75000));
        l.add(new Employee1("Azam",19,45000));

        List<Employee1> filterList = l.stream().filter(employee1 -> employee1.getSalary() > 7500)
                .collect(Collectors.toList());
        for (Employee1 employee1 : filterList){
            System.out.println("Name:" +employee1.getName());
            System.out.println("Age:"+employee1.getAge());
            System.out.println("salary:" +employee1.getSalary());
        }


    }
}
class Employee1{
    private String name;
    private int age;
    private double salary;

    Employee1(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}