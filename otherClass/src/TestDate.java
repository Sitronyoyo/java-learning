import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long nowNum = System.currentTimeMillis(); //返回此时此刻计算机的时间
        System.out.println(nowNum);

        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());//返回此时此刻计算机的时间

        Date date2 = new Date(-21L*365*24*3600*1000); //1970-1949=21L, 365天24小时3600秒1000毫秒，往前推所以为负数
        System.out.println(date2);

        System.out.println(date2.equals(date1));
        System.out.println(date2.before(date1));
        System.out.println(date2.after(date1));
    }
}
