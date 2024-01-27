package mock;

public class B {
    //Write a prgm to illustrate a lambda expression associated with a functional interface to add two numbers
    public static void main(String[] args) {
        M m1 = (a,b)-> System.out.println("The sum of two number:"+(a+b));
        m1.add(10,40);

    }
}
@FunctionalInterface
interface M{
    public void add(int a,int b);
}