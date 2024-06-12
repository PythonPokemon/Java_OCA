/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_20_bis_29;

public class test21 {
    public static void main(String[] args) {
        int ctr = 100;
        one: for (int i = 0; i < 10; i++) {
            two: for (int j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);    // 102
    }
}
