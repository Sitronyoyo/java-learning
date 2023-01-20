public class TestZhiBiao {
    public static void main(String[] args) {
        Object[] a1 = {1001,"xiao",20};
        Object[] a2 = {1002,"ming",25};
        Object[] a3 = {1003,"Hongsu",30};
        Object[][] temp = new Object[3][];
        temp[0] = a1;
        temp[1] = a2;
        temp[2] = a3;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
