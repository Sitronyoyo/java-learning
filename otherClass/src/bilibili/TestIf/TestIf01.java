package bilibili.TestIf;

import java.util.Scanner;

public class TestIf01 {
    public static void main(String[] args) {
        boolean redLight = false;
        boolean greenLight = false;
        boolean yellowLight = true;
        if (redLight) {   // 此处可省略 ==true
            System.out.println("stop");
        }
        if(greenLight){  // 此处可省略 ==true
            System.out.println("go");
        }
        if(yellowLight){  // 此处可省略 ==true
            System.out.println("wait");
        }


    }
}
