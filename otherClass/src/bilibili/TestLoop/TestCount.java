package bilibili.TestLoop;

import java.util.Scanner;

/*录入两个整数，作为区间
求既能被3整除又能被5整除的数的个数
 */
public class TestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入区间开始整数");
        int start = sc.nextInt();
        System.out.println("输入区间结束整数");
        int end = sc.nextInt();

        int count = 0;
        for(int i=start; i<=end; i++){
            if(i%3==0 && i%5==0){
                count += 1; //count++;
            }
        }
        System.out.println(count);

    }
}
