package bilibili.oop;

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
        h.getVehicle();
        Vehicle v = new Vehicle();
        v.run();
        v.getVehicle();
        Plane p = new Plane();
        p.run();
    }
}

class Vehicle {
    public void run(){
        System.out.println("Run...");
    }

    public Vehicle getVehicle(){
        System.out.println("给你一个交通工具！");
        return null;
    }
}

class Horse extends Vehicle{
    @Override
    public void run() {  // 重写方法， 覆盖之前得方法
        System.out.println("得得得。。。");;
    }

    public Horse getVehicle(){
        System.out.println("骑马");
        return null;
    }
}

class Plane extends Vehicle{

}