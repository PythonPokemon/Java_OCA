/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_50_bis_59;

public class test56 {
    public static void main(String[] args) {
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2); // true
    }
}
