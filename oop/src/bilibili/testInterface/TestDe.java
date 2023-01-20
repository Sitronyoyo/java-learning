package bilibili.testInterface;

public class TestDe {
    public static void main(String[] args) {
        System.out.println("++测试默认方法++");
        TestDefault td = new TestDefault_01();
        td.printInfo();
        td.moren();
        System.out.println();
        System.out.println("++测试默认方法++");
        TestDefault.testStatic01();
        TestDefault_01.testStatic01();
    }
}

/**
*++测试默认方法++
 * TestDefault_01.printInfo
 * TesteDefault.moren
 * 测试默认方法
 * 测试静态方法-接口.testStatic01
 *
 * ++测试默认方法++
 * 测试静态方法-接口.testStatic01
 * 测试静态方法-子类.testStatic01
 */