import java.io.File;
//打印目录树，结合递归
public class PrintFileTree {
    public static void main(String[] args) {
        //File f = new File("C:\\Users\\yuany\\OneDrive\\IN1010");
        File f = new File(System.getProperty("user.dir"));
        printFile(f,0);
    }


    static void printFile(File file, int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        //print filename
        System.out.println(file.getName());

        if (file.isDirectory()){
            File[] files = file.listFiles();//新方法，列出所有子文件，子目录
            for(File temp:files){
                printFile(temp,level+1);
            }
        }

    }
}
