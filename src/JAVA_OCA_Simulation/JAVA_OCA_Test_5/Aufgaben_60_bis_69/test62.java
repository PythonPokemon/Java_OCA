/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_60_bis_69;
// Datei zusatz: Profitable1 | Profitable2
public abstract class test62 implements Profitable1, Profitable2 {
    public static void main(String[] args) {

    }
    /*INSERT*/
    public double profit() {

        return Profitable2.super.profit();

    }
}
