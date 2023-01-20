package bilibili.innerClass;

public class TestInnerClass {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner(); //访问另一个类中的内部类， 需要这么写
        i.show();
    }
}
