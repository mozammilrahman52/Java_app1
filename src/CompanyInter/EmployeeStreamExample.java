package CompanyInter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name; // formatted as firstName_lastName
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class EmployeeStreamExample {
//Consider Employee class having id, Name(firstName_lastName), salary.
// Use the java 8 Streams to perform the below-
//1. Sort based on their lastName. If two lastNames are same then use firstName.

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John_Doe", 50000),
                new Employee(2, "Jane_Smith", 60000),
                new Employee(3, "Adam_Jones", 55000),
                new Employee(4, "Mary_Doe", 52000)
        );

        // Sorting based on lastName, and then firstName if lastNames are the same
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> {
                    String[] name1 = e1.getName().split("_");
                    String[] name2 = e2.getName().split("_");

                    int lastNameComparison = name1[1].compareTo(name2[1]);
                    if (lastNameComparison == 0) {
                        return name1[0].compareTo(name2[0]);
                    } else {
                        return lastNameComparison;
                    }
                })
                .collect(Collectors.toList());

        // Print the sorted employees
        sortedEmployees.forEach(System.out::println);

    }
}

