import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile01 {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        File f1 = new File("a.txt"); //相对路径，默认放到user.dir目录下面
        f1.createNewFile(); //创建文件

        //File f2 = new File("d:/b.txt"); //绝对路径
        //f2.createNewFile()

        System.out.println("文件是否存在 "+f1.exists());
        System.out.println("是否为目录 "+f1.isDirectory());
        System.out.println("是否为文件 "+f1.isFile());
        System.out.println("最后更改时间 "+ new Date(f1.lastModified()));
        System.out.println("文件长度 "+f1.length());
        System.out.println("文件名 "+f1.getName());
        System.out.println("目录路径 "+f1.getPath());
;
    }
}
