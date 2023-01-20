package bilibili.testInterface;
//测试默认方法和静态方法
public interface TestDefault {
    void printInfo();
    default void moren(){ //默认方法，前面有default
        System.out.println("TesteDefault.moren");
        System.out.println("测试默认方法");

        testStatic01(); //默认方法中可直接调用静态方法，反之不行
    }

    public static void testStatic01(){  //该静态方法和子类中的静态方法完全不同
        System.out.println("测试静态方法-接口.testStatic01");
    }
}

class TestDefault_01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("TestDefault_01.printInfo");
    }

    public static void testStatic01(){
        System.out.println("测试静态方法-子类.testStatic01");
    }
}
