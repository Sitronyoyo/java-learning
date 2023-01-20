package bilibili.TestIf;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your score:");
        int score = sc.nextInt();

        //对异常数据进行校验 0-100之间为合理数据
        if(score>=0 && score<=100){
            /*95-100 perfect
            90-94 bra
            80-89 ok
            0-79 Try to work hard!
             */
            if(score>=95){
                System.out.println("perfect!");
            }else if(score>=90){
                System.out.println("bra!");
            }else if(score >=80){
                System.out.println("ok!");
            }else{
                System.out.println("Try to work hard!");
            }
        }else{
            System.out.println("Your score is wrong!");
        }
    }
}
