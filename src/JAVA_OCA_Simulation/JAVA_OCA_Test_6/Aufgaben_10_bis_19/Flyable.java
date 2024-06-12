package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_10_bis_19;

public interface Flyable {
    static int horizontalDegree() { //Line n1
        return 20;
    }

    default void fly() {
        System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2
    }

    void land();
}