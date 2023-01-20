package bilibili.TestLoop;
/*打印折纸次数
已知珠穆朗玛峰=8844430毫米  ->已知循环结束条件，建议使用while循环
加入有一张纸的厚度为0.1毫米，
问 需要折多少次可达到珠穆朗玛峰的高度
 */
public class TestOrigami {
    public static void main(String[] args) {
        //珠峰的高度
        double height_m = 8844430;

        //纸的厚度 - 初始化语句
        double paper = 0.1;
        //初始化次数
        int count = 0;
        while(paper < height_m){
            count++;  //循环体
            paper *= 2; //条件控制语句

        }
        System.out.println(count);
    }
}
