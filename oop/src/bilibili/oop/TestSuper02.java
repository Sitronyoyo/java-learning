package bilibili.oop;

public class TestSuper02 {
    public static void main(String[] args) {
        new ChildClass02();
    }
}

class FatherClass02{
    static{
        System.out.println("静态初始化:FatherClass");
    }

    public FatherClass02(){
        //super(); 写不写都一样
        System.out.println("创建FatherClass");
    }
}

class ChildClass02 extends FatherClass02{
    static{
        System.out.println("静态初始化:ChildClass");
    }
    public ChildClass02(){
        //super(); 写不写都一样，会先打印
        System.out.println("创建ChildClass");
    }
}
/**
 * 结果= 先初始化，再创建
 * 静态初始化:FatherClass
 * 静态初始化:ChildClass
 * 创建FatherClass
 * 创建ChildClass
 */
