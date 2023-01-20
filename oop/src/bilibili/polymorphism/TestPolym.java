package bilibili.polymorphism;
//测试多态
public class TestPolym {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());

        //编译类型Animal  运行时类型Dog
        Animal a = new Dog(); //向上转型，自动
        a.shout();
        Dog d = (Dog)a; //向下转型，强制
        d.seeDoor();

        if(a instanceof Cat){  //判断a是不是Cat 类
            Cat c = (Cat)a;
            c.catchMouse();
        }
    }

    static void animalCry(Animal a){
        System.out.println("TestPolym.animalCry");
        a.shout();   //可以出现多态
    }
}
