import java.util.Random;

//测试枚举
public class TestEnum {
    public static void main(String[] args) {
//        System.out.println(jijie.autumn);
        System.out.println(Season.spring);

        for(Season s:Season.values()){  //遍历
            System.out.println(s);
        }

        int a = new Random().nextInt(4);// [0,4)
        switch (Season.values()[a]){
            case spring:
                System.out.println("春天");
                break;
            case summer:
                System.out.println("夏天");
                break;
            case autumn:
                System.out.println("秋天");
                break;
            case winter:
                System.out.println("冬天");
                break;
        }
    }
}

enum Season{
    spring,summer,autumn,winter
}

class jijie {
    public static final int spring = 0;
    public static final int summer = 1;
    public static final int autumn = 2;
    public static final int winter = 3;

}