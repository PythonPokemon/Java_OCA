/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_1_bis_9;

class Counter {
    static int ctr = 0;
    int count = 0;
}

public class test1 {
    public static void main(String[] args) {
        Counter ctr1 = new Counter();
        Counter ctr2 = new Counter();
        Counter ctr3 = new Counter();

        for(int i = 1; i <= 5; i++ ) {
            ctr1.ctr++;
            ctr1.count++;
            ctr2.ctr++;
            ctr2.count++;
            ctr3.ctr++;
            ctr3.count++;
        }

        System.out.println(ctr3.ctr + ":" + ctr3.count);    //<--- 15:5

    }
}
