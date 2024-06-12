/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_1_bis_9;


// Greift auf Dateien zu: Sellable & Chair
public class test6 {
    public static void main(String[] args) {
        Sellable obj = new Chair(); //Line n1
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2
    }
}
