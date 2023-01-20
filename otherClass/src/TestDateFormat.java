import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "2049-10-1 10:10:10";
        Date guoqing100=format.parse(str);
        System.out.println(guoqing100.getTime());
        System.out.println(guoqing100);

        DateFormat format2 = new SimpleDateFormat("yyyy,MM,dd hh:mm:ss");
        Date date2 = new Date(23456L);
        String date2Str = format2.format(date2);
        System.out.println(date2Str);

        Date now = new Date();
        DateFormat format3 =new SimpleDateFormat("今天是第D天，第W周");
        String str3 = format3.format(now);
        System.out.println(str3);
    }
}
