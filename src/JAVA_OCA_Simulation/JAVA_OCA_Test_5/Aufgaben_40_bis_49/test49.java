/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_40_bis_49;

public class test49 {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        return this.i1 + this.i2; //Line n1
    }

    public static void main(String[] args) {
        System.out.println(new test49().add()); //Line n2   | 30
    }
}
