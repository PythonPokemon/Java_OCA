package TestAufgaben;

public class LZK2 {

    private int i;
    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5; ) {
                System.out.print(i + " ");  //  Printed 6x 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        new LZK2().disp();
    }
}

