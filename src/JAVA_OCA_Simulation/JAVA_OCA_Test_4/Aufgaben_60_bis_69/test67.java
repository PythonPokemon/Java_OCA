/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_60_bis_69;

public class test67 {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a); //<--- a = 9
        System.out.println("res = " + res); //<--- res = true
    }
}
