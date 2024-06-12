/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_20_bis_29;

public class test21 {
    public static void main(String[] args) {
        int i;
        outer:
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);    // 5
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);
    }
}
