package bilibili.TestLoop;
//测试break 结束整个循环
//总共5个包子，小老虎吃了三个就不吃了
public class TestSkip02 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("小老虎吃第" +i +"个包子");
            if(i==3){
                break;
            }

        }
    }
}
