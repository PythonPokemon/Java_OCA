/*
 * 0
 * Gesamterklärung
Wir haben keine Befehlszeilenargumente übergeben, daher bezieht sich args auf ein Array-Objekt der Größe 0.

args.length gibt 0 aus. args ist nicht null und daher keine NullPointerException.

Außerdem greifen wir nicht auf das Array-Element zu, also keine Frage von ArrayIndexOutOfBoundsException.
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;

public class test52 {
    public static void main(String[] args) {

        System.out.println(args.length);
    }
}
