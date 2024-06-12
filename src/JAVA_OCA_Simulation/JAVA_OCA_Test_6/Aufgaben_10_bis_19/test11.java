/*

Flying at 20 degrees.
Landing at -20 degrees.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_10_bis_19;
// Dateizusatz: Flyable
public class test11 implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); //Line n3
    }

    public static void main(String[] args) {
        new test11().fly();
        new test11().land();
    }
}