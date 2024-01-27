package mock3;

class M322{
    public static void main(String[] args){
        Address a1 = new Address();
        a1.pinCode = 8011;
        Address a2 = new Address();

        BankCustomer1 b = new BankCustomer1(100,a1);
        BankCustomer1 b1 = new BankCustomer1(101,a2);
        a1=b.getAddress1();
//        a1.pinCode=800004; // here, pinCode is changing it means change in a object so it is not good. I will fixed in class M323.
        System.out.println(b.getAddress1());
        System.out.println(a1.pinCode);
        System.out.println(b1.getAddress1());
        // System.out.println(b.getAccNo());
    }
}

final class BankCustomer1{
    final private int accNo;
    Address addr;
    public BankCustomer1(int accNo, Address addr){
        this.accNo=accNo;
        this.addr=addr;
    }
    public int getAccNo(){
        return accNo;
    }
    public Address getAddress1(){
        return addr;
    }
}

class Address1{
    int pinCode;
}
