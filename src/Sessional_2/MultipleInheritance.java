package Sessional_2;

interface X{
    void testX();
    void test();
}

interface A extends X{
    int a = 10;
    void testA();
    void test();
}
interface B extends X{
    void testB();
    void test();
}
class C implements A,B{
    @Override
    public void test() {

    }
    @Override
    public void testX() {

    }

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.test();
        c.testA();
        c.testB();
        c.testX();
    }
}
