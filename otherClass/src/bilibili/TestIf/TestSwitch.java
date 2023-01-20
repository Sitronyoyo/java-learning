package bilibili.TestIf;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想吃的面条");
        String noodle = sc.nextLine();

        switch(noodle){
            case "刀削面":
                System.out.println("今天吃刀削面");
                break;
            case "油泼面":
                System.out.println("今天吃油泼面");
                break;
            case "拉面":
                System.out.println("今天吃拉面");
                break;
            default:
                System.out.println("对不起，您点的面条没有。可以吃泡面");
                break;
        }
    }
}
