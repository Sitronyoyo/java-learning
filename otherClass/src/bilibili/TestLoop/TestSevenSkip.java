package bilibili.TestLoop;
/*设计逢7过的小游戏，100以内
只要数字含7或者是7的倍数，就直接过
分析，1，2，3，4，5，6，过，8，9  ---ge 7, shiWei 7, 7的倍数
1） 范围= 1-100之间的每个数字
开始为1， 结束为100
 */
public class TestSevenSkip {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%7==0 || i%7==7 || i/10%7==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
