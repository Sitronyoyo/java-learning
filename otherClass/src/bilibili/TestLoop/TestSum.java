package bilibili.TestLoop;

public class TestSum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<=100; i++){
            if(i%2==0){
                sum += i; //累加
            }
        }
        System.out.println("1-100之间的偶数和为"+sum);
    }


}
