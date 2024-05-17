package JAVA_OCA_Test_3.Aufgaben_50_bis_59;

public class Greetings {
    String msg = null;

    public Greetings() {
        this("Good Morning!");
    }

    public Greetings(String str) {
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