import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int id = s.nextInt();
        System.out.println("请输入你的名字 "+name);
        System.out.println("请输入你的id "+id);

    }

}
