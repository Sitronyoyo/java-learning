package bilibili.array;

public class Test01 {
    public static void main(String[] args) {
        int[] s; //声明数组
        s = new int[10]; //创建数组
        System.out.println(s[0]); //打印数字0位置的数字
        System.out.println(s[1]);//打印数组1位置的数字
        for(int i =0; i<10; i++) { //for循环，循环十次
            s[i] = 2 * i + 1; //数字变化，加二
            System.out.println(s[i]); // 打印每个数字
        }

        Man[] mans = new Man[10];
        Man m1 = new Man(1,11);
        Man m2 = new Man(2,22);

        mans[0]=m1;
        mans[1]=m2;

        System.out.println(mans[0].getId());
        System.out.println(mans[0].getAge());
    }
}

class Man{
    private int age;
    private int id;
    public Man(int id, int age){
        super();
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
