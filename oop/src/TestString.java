//测试String
public class TestString {
    public static void main(String[] args) {
        String s0 = null;
        String s1 = "";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1.length()); // 变量.length() 查看长度 0
        System.out.println(s2.length()); // 4
        // System.out.println(s0.length()); 这个是错误的，因为null
    }
}
