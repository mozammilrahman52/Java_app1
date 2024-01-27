package mock3;

class M323{
    public static void main(String[] args){
        Address a1 = new Address(101);
         a1.pinCode = 801103;
        Address a2 = new Address(102);

        BankCustomer b = new BankCustomer(101,a1);
        BankCustomer b1= new BankCustomer(102,a2);
        a1 = b.getAddress();
//        a1.pinCode = 80004;

        System.out.println(b.getAddress());
        System.out.println(a1.pinCode);
        System.out.println(b1.getAddress());


    }
}

final class BankCustomer{
    private final int a;
    Address addr;
    public BankCustomer(int a,Address addr){
        this.a = a;
        this.addr=addr;
    }
    public int getA(){
        return a;
    }

    public Address getAddress(){

        return new Address();
    }
}

class Address{
    int pinCode;
    Address(){
    }
    public Address(int pinCode){
        this.pinCode = pinCode;
    }
}
