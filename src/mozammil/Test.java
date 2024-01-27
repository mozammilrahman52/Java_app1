package mozammil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        ArrayList ts = new ArrayList();
        ts.add(new Employee(100));
        ts.add(new Employee(300));
        ts.add(new Employee(10));
        ts.add(new Employee(500));
        ts.add(new Employee(300));
        System.out.println(ts);

        Collections.sort(ts);
        System.out.println(ts);
    }
}
class Employee implements Comparable{
    int id;
    Employee(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Object o){
        Employee employee = (Employee) o;
        if(this.id > employee.id){
            return 1;
        }else if (this.id < employee.id){
            return -1;
        }
        return 0;
    }

    public String toString(){
        return ""+id;
    }
}