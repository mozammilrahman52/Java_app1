package mock3Interface;
public interface A {
    void test1();
    void test2();

}
class B implements A{

    @Override
    public void test1() {
        System.out.println(500);
    }

    @Override
    public void test2() {
        System.out.println("Mozammil");
    }
}