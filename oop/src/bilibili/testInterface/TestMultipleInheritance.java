package bilibili.testInterface;
//测试接口的多继承
public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new Cimpl01();
        c.testA();
        c.testB();
        c.testC();
    }

}

interface A{
    void testA();
}

interface B{
    void testB();
}

interface C extends A,B{ //C接口中有testA, testB, testC
    void testC();
}

class Cimpl01 implements C{
    @Override
    public void testA() {
        System.out.println("Cimpl01.testA");
    }

    @Override
    public void testB() {
        System.out.println("Cimpl01.testB");

    }

    @Override
    public void testC() {
        System.out.println("Cimpl01.testC");
    }
}

