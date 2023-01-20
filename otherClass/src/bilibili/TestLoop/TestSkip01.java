package bilibili.TestLoop;
//测试跳过第三次循环，需要加if条件判断 ----continue

//共5个包子，小老虎没吃第三个，其他都吃， 用continue 跳过某次循环
public class TestSkip01 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if(i==3){
                continue;
            }
            System.out.println("小老虎吃第"+i+" 个包子");

        }
    }

}
