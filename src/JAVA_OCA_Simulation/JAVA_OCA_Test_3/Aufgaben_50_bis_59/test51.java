/*
ist die aufgabe von Greetings

Good Morning!
Good Evening!
------------------------------------------------------------------------------------------------------------------------

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_50_bis_59;

public class test51 {
    String msg = null;

    public test51() {
        this("Good Morning!");
    }

    public test51(String str) {
        msg = str;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
        test51 g1 = new test51();
        test51 g2 = new test51("Good Evening!");
        g1.display();
        g2.display();
    }
}