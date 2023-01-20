package bilibili.TestLoop;

public class TestFor {
    public static void main(String[] args) {
        //循环3次
        for(int i = 0; i<3; i++){
            System.out.println("Hello");
        }

        //求和， 1-5
        int sum = 0;
        for(int i =1; i<=5; i++){
            sum += i;
        }
        System.out.println("1-5之间的和为:"+sum);
    }
}
