package bilibili.array;

public class TestLoop01 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,8,9,};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // 快捷键 数组名.fori 回车
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
