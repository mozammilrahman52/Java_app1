package mock2;
//Immutable String class.
final public class A {
    private final  int age;
    Address addr;

    private A(int age,Address addr){
        this.age = age;
        this.addr = addr;

    }
    private int getAge(){
        return age;
    }

    {
//        public Address geAddress (){
//            return addr;
//    }
    }


    public static void main(String[] args) {
        Address d1 = new Address(101);
        Address d2 = new Address(102);
        A a1 = new A(10,d1);
        A a2 = new A(4,d2);
        System.out.println(a2.getAge());
        System.out.println(a1.getAge());


    }
}
class Address{
    int pinCode;
    public Address (int PinCode){
        this.pinCode =pinCode;
    }
}