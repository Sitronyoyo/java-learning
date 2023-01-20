package bilibili.TestIf;

import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How much have you paid?(int)");
        int paid = s.nextInt();
        if(paid >= 600){
            System.out.println("ok!You can go!");

        }else{
            System.out.println("Not paid. Try again!");
        }

    }
}
