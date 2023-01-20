package bilibili.WrapperClass;

public class TestInteger {
    public static void main(String[] args) {
        Integer i = new Integer(50); //从java9开始被废弃，不推荐
        Integer j = Integer.valueOf(10); //官方推荐， 将数字10转成对象Integer

        int a = j.intValue();//把包装类对象j转成基本数据类型int
        double b = j.doubleValue();

        //把字符串转化成数字
        Integer m = Integer.valueOf("456");

        System.out.println(Integer.MAX_VALUE); //打印Integer的最大值

        //测试自动装修和拆箱
        Integer x = 100; // 编译器: Integer j = Integer.valueOf(100);
        int y = x; // 编译器: int y = x.intValue();  拆箱

        Integer z = null;
        //int z2 = z; // 编译器: int z2 = z.intValue();

        //包装类的缓存问题
        Integer x1 = 100;
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1==x2);  //[-128,127]之间传回true
        System.out.println(x3==x4); // 超过范围，传回false，表示x3和x4不是同一个对象
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));


    }

}
