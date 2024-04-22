package TestAufgaben;

public class LZK1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 3; j > 0 ; j--) {
                if (i == j) {
                    count++;
                    break;
                }
                System.out.print(count);
                continue;
            }
        }
    }
}
