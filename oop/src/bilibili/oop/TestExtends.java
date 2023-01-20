package bilibili.oop;

public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("Yuanyuan",165,"IT");
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Student);
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("Take a break!");
    }
}

class Student extends Person {
    String major;

    public void study(){
        System.out.println("Study!");
        rest();
        System.out.println(this.name);
    }

    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }

}

