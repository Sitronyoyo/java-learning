package bilibili.encapsulation.a;

public class User {
    private int id;
    private String name;
    private  boolean man;

    public static void main(String[] args) {
        User u1 = new User(1001,"zhang san", true);
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.isMan());
        u1.setId(8007);
        u1.setName("hua hua");
        u1.setMan(false);
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.isMan());

    }

    public User(int id, String name, boolean man){
        this.id = id;
        this.name = name;
        this.man = man;
    }
    /**
     * 右键 - generate
     * - getter and setter
     * 选中需要访问的相关属性，然后生产以下的get and set方法，用来访问相关的私有属性
     * @return
     */
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

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
