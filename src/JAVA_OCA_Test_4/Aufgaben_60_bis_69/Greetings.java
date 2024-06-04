/*
null
null
* */

package JAVA_OCA_Test_4.Aufgaben_60_bis_69;

public class Greetings {
    String msg = null;
    public Greetings() {
    }

    public Greetings(String str) {
        msg = str;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
        Greetings g1 = new Greetings();
        Greetings g2 = new Greetings("Good Evening!");
        g1.display();
        g1.display();
    }
}
