package bilibili.operations;/*测试逻辑运算符
问题 输入两个整数只要其中一个为6则为true,或者这两个数相加对6整除也为true
分析》 a=6||b=6||(a+b)%6=0
 */

import java.util.Scanner;

public class TestLogic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = s.nextInt();
        System.out.println("请再输入一个整数");
        int num2 = s.nextInt();

        boolean result = num1==6||num2==6||(num1+num2)%6==0;
        System.out.println(result);
    }
}
