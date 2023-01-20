package bilibili.testInterface;
//飞行接口
public interface Volant {
    /*public static final*/ int Fly_Hight = 100;
    /*public abstract*/ void fly();

}
//善良接口
interface  Honest{
    void helpOther();

}

class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("helpfull");
    }
}

class BirdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}

class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("Angel is flying");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel help people!");

    }
}

class Plane implements Volant{

    @Override
    public void fly() {
        System.out.println("Plane is in the heven!");
    }
}