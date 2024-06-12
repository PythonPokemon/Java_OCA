/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_70_bis;

interface Perishable1 {
    default int maxDays() {
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    default int maxDays() {
        return 2;
    }
}

class Milk implements Perishable2, Perishable1 {}

public class test70 {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays());  // 2
    }
}
