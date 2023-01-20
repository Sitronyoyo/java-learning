package Test;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person("John");
        System.out.println(p);

        int x = 2;
        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

class Person{
    private String navn;

    @Override
    public String toString() {
        return navn;
    }

    public Person(String navn){
        this.navn = navn;
    }
}
