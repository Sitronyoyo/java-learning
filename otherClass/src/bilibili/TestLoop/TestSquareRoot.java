package bilibili.TestLoop;

import java.util.Scanner;

/*测试平方根
需求=- 键盘录入一个大于等于2的数字x,计算返回x的平方根
结果只保留整数部分，小数部分去除

分析-分整除和不整除的情况， 使用for循环
1）整除, 比如: 2*2 = 4, 则2是4的平方根
2)无法整除， 比如10的平方根在3-4之间，即如果4*4是第一个大于10的数字，则(4-1)是10的平方根的整数部分
 */
public class TestSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数:");
        int x = sc.nextInt();

        for(int i = 2; i<x; i++){
            if(i*i == x){
                System.out.println(x+"的平方根为"+i);
                break; //找到了就可以停止循环
            }else if(i*i>x){
                System.out.println(x+"的平方根的整数部分为"+(i-1));
                break;//找到了就可以停止循环
            }


        }
    }
}
