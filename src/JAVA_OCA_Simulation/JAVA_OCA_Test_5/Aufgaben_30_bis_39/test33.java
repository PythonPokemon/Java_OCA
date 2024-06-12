/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_30_bis_39;

interface Profitable {
    double profitPercentage = 42.0;
}

class Business implements Profitable {
    double profitPercentage = 50.0; //Line n1
}

public class test33 {
    public static void main(String[] args) {
        Profitable obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3 | 42.0
    }
}
