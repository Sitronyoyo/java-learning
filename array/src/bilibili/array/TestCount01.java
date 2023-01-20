package bilibili.array;

public class TestCount01 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 41, 5, 1};
        int count = 0;
        for(int i = 0; i< arr.length; i++){ //遍历
            if(arr[i]%2==0) { //判断找偶数
                arr[i] /= 2;     //偶数除以2
            }else{
                arr[i] *= 2; // 奇数乘以2
            }
        }
        //建议一个循环只干一件事情，多了可以分成两个循环
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
