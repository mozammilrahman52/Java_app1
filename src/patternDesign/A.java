package patternDesign;
//this is singlton design pattern.
public class A {
   private static A a1;
   private A(){

   }
   public static A getInstance(){
       if(a1==null){
           a1 = new A();
       }
       return a1;
   }
   public void getBalance(){
       System.out.println(5000);
   }

    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        a1.getBalance();

    }
}