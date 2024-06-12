/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_40_bis_49;

public class test46 {
    private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (RuntimeException)e;
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(ArithmeticException e) {
            System.out.println("AE");   // AE
        } catch(RuntimeException e) {
            System.out.println("RE");
        }
    }
}
