package bilibili.TestLoop;
/*测试是否为回文数，即一个数字从左到右 和 从右到左 是一样的。 如121
1，先将数字倒过来
2，再判断
 */
public class TestPalindrome {
    public static void main(String[] args) {
        //1.先将数字倒过来
        int x = 12345; //1).初始化语句
        int temp = x; //定义一个临时变量，用来记录原来x的值
        int num = 0; //新数字
        while(x!=0){  //2).条件判断
            int ge = x%10;
            x = x/10; //3).条件控制语句,整数除以整数得整数，目的是去除末尾
            num = num*10+ge;
        }
        //2.打印倒过来的新数字
        System.out.println(num);
        System.out.println(num==temp);
    }
}
