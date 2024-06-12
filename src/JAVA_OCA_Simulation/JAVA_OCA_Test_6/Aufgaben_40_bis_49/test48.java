/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_40_bis_49;

class Beta {
    public String num = "10"; //Line n1
}

class Beb extends Beta {
    protected int num = 20; //Line n2
}

public class test48 {
    public static void main(String[] args) {
        Beta obj = new Beb();
        System.out.println(obj.num += 2); //Line n3
    }
}
