package CompanyInter;
//thread safe singleton design example.
// this is lazy loading by default.
public class C {
    private static  C c;

    private C(){

    }
    public static C getC(){
        if(c == null){
            synchronized(C.class){
                if(c == null){
                    c = new C();
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        C c1 = getC();
        C c2 = getC();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
