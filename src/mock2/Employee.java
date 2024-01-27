package mock2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int age;
    double salary;
    Employee(String name,int age, double salary){
        this.age = age;
        this.name =name;
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

    public static void main(String[] args){
        List<Employee> employees =   Arrays.asList(
                new Employee("Mozammil", 25,100000),
                new Employee("Azam",24,30000),
                new Employee("Naaz",30,300000),
                new Employee("Ayesha",22,500000)
                );

//        List<Employee> filterEmployee = employees.stream().filter(e ->e.getSalary()>30000 )
//                .collect(Collectors.toList());
        Predicate<Employee> p = e -> e.getSalary()>250000;//Predicate Functional Interface
        for (Employee employee: employees){
            if(p.test(employee)) {
                System.out.println("Employee Name:"+employee.getName());
                System.out.println("Employee salary:"+employee.getSalary());
                System.out.println("Employee Age:"+employee.getAge());
            }
        }



//  Employee [] employees = {
//                new Employee("Mozammil", 25,10000),
//                new Employee("Azam",24,30000),
//                new Employee("Naaz",30,400000),
//                new Employee("Ayesha",22,500000)
//
//          };
//        Predicate<Employee> p = e->e.salary>300000;
//  for (Employee e1:employees) {
//      if(p.test(e1)) {
//          System.out.println("Employee Name:" + e1.name);
//          System.out.println("Employee age:" + e1.age);
//          System.out.println("Employee salary:" + e1.salary);
//      }
//  }

    }

}
