/*
gehört zu test.47
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

public class Counter {
    public int count = 0;

    public Counter(int start) {
        count = start;
    }

    public int getCount() {
        return count;
    }

    public void increase(int val) {
        count = count + val;
    }

    public String toString() {
        return this.count + "";
    }
}
