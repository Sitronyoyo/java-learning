package bilibili.oop;

import java.util.Objects;

/**
 * 所有的类都是Object类得子类
 * 也都具备Object类得所有特性
 */

public class TestObject extends Object{
    int id;
    String name;
    String pwd;

    public TestObject(int id, String name, String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }



    public static void main(String[] args) {
        TestObject t = new TestObject(123,"he cao","123456");
        System.out.println(t.toString());
        System.out.println(t); //默认调用toString()方法， 即和上一行是一样的结果

        TestObject e1 = new TestObject(1001,"zhang san","123456");
        TestObject e2 = new TestObject(1001,"li si","456789");
        System.out.println(e1); //如果toString()方法没有被重写，即打印地址
        System.out.println(e2);
        System.out.println(e1.equals(e2)); //e1和e2的地址不同，打印false

    }

    /**
     * 重写 equals()
     * @param o   the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
