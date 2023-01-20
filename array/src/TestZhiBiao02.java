//制表， 利用一维数组和javabean

public class TestZhiBiao02 {
    public static void main(String[] args) {
        Emp[] emps ={
                new Emp(1001,"xiao",20),
                new Emp(1002,"ming",25),
                new Emp(1003,"Hongyu",30)
        };
    for(Emp t:emps){
        System.out.println(t);

    }
    }
}

class Emp{
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+age+"\t";
    }

    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
