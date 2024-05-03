package JACA_OCA_Test_1.Aufgaben_10_bis_19;

public class test12 {
    public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)){
            System.out.println(x);  // endlosschleife 1
        }
    }

    private static boolean checkAndIncrement(int x) {
        if (x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}
