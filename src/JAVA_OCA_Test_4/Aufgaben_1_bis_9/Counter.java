package JAVA_OCA_Test_4.Aufgaben_1_bis_9;

public class Counter {
    int count;

    private static void increment(Counter counter) {
        counter.count++;
    }

    public static void main(String [] args) {
        Counter c1 = new Counter();
        Counter c2 = c1;
        Counter c3 = null;
        c2.count = 1000;
        increment(c2);
    }
}