/*

FINALLY is printed to the console, stack trace is printed and then program ends abruptly
 * */
package JAVA_OCA_Test_5.Aufgaben_10_bis_19;

public class test12 {
    private static void div() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}
