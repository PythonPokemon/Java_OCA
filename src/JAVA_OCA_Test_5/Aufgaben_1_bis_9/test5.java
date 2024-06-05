/*


 * */
package JAVA_OCA_Test_5.Aufgaben_1_bis_9;

public class test5 {
    public static void main(String [] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 9;
        boolean res = --a + --b < 1 && c++ + d++ > 1;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res);
        // Ergebnis | a = 2, b = 4, c = 7, d = 9, res = false
    }
}
