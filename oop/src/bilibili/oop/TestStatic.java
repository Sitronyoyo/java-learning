package bilibili.oop;

public class TestStatic {
    int id;
    String name;
    String psw;
    static String company = "Beijing SHANG";

    public TestStatic(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void login(){

        System.out.println(name);
    }

    public static void printCompany(){
        //login();不可以调用非静态成员
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic u = new TestStatic(101,"gao xiao qi");
        TestStatic.printCompany();
        TestStatic.company = "A li company";
        TestStatic.printCompany();

    }

}

