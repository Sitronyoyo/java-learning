package bilibili.oop;

public class TestStatic02 {
    static String company; //公司名称
    static{     //静态初始化
        System.out.println("初始化:");
        company = "yi he tang";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

    }

}
