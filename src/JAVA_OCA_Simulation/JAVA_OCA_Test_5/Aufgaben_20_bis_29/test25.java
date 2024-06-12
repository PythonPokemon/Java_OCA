/*

Test class compiles successfully and on execution prints 1010 on to the console
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_20_bis_29;
// Datei: Counter
public class test25 {
    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3  | 1010
        }
    }
}
