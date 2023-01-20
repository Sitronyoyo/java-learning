package bilibili.operations;//测试三元运算， 打印数字中那个大的数字

import java.util.Scanner;

public class TestTernary {
    public static void main(String[] args) {

        //两个比较，求最大值
        Scanner s = new Scanner(System.in);
        System.out.println("tast inn et heltall:");
        int num1 = s.nextInt();
        System.out.println("tast inn et hettall til ");
        int num2 = s.nextInt();

        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);

        System.out.println(num1 > num2 ? num1 : num2); //也可以直接打印，与上两行的结果相同


        //三个数字比较，求最大值. 可先比较两个得出最大值，再用这个最大值与第三个进行比较
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int max1 = height1 > height2 ? height1 : height2;
        int max2 = max1 > height3 ? max1 : height3;
        System.out.println(max2);

    }

}
