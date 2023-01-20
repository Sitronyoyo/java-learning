package bilibili.TestLoop;

import java.util.Scanner;

/*测试是不是质数
键盘录入一个整数，判断它是不是质数
分析， 需要判断 2到（数字-1）是不是能够被这个数字整除
一旦找到，就可以停止循环
 */
public class TestZhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        boolean isPrimeNum = true;

        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
                isPrimeNum = false;
                break;
            }
        }

        if(isPrimeNum==true){
            System.out.println(num+"\t is a prime number.");
        }else{
            System.out.println(num+"is not a prime number.");
        }
    }
}
