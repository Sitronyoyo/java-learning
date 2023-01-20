package bilibili.TestLoop;
/*
求 num1被除数/num2除数 的商和余数和商， 要求不能使用/, %
 */
public class TestSub {
    public static void main(String[] args) {
        int num1 = 100;// 定义被除数dividend
        int num2 = 10; //定义除数divisor
        int count = 0;
        while(num1>=num2){
            num1 -= num2;
            count++;
        }
        System.out.println("商为 "+count);//减了几次count 是商
        System.out.println("余数为 "+num1); //此时剩下的num1被除数即是余数


    }
}
