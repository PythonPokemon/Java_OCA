/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_10_bis_19;

public class test16 {
    public static void main(String[] args) {
        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");   // FTFFF
        }
    }
}
