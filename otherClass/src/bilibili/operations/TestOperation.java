package bilibili.operations;//测试运算 键盘录入一个三位数，将其拆分成个十百位后，打印

/*公式总结:
个位   数值%10
十位   数值/10%10
百位   数值/100%10
...
 */
import java.util.Scanner;
public class TestOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int num = s.nextInt();

        int geWei = num % 10;
        int shiWei = num / 10 % 10;
        int baiWei = num / 100 % 10;
        System.out.println(geWei);
        System.out.println(shiWei);
        System.out.println(baiWei);

        System.out.println("123" + 123);


    }
}
