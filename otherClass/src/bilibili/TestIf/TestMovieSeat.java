package bilibili.TestIf;
/*测试电影院选座 1-100共100个位置
奇数坐左边，偶数坐右边
 */

import java.util.Scanner;

public class TestMovieSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tast inn ditt tickets nummer:");
        int ticket = sc.nextInt();
//只有当票号在1到100之间才是真实有效的票，要做判断
        if(ticket>0&&ticket<101){
            if(ticket%2 == 1){  //奇数
                System.out.println("Your seat is on the left hand.");
            }else{
                System.out.println("Your seat is on the right hand.");
            }
        }


    }

}
