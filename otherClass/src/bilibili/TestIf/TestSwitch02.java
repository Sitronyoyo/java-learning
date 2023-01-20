package bilibili.TestIf;

import java.util.Scanner;

public class TestSwitch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which day is today in an week!");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday: swim");
                break;
            case 2:
                System.out.println("Tuesday: run");
                break;
            case 3:
                System.out.println("Wednesday: boxing");
                break;
            case 4:
                System.out.println("Thursday: shopping");
                break;
            case 5:
                System.out.println("Friday: movie");
                break;
            default:
                System.out.println("Weekend: take a break");
                break;
        }
    }
}
