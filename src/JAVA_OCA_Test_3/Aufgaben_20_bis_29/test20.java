/*
2
1

Gesamterklärung
Es gibt keine Kompilierungsfehler und die Methode main(String[]) wird beim Ausführen der Testklasse aufgerufen.
i1 = 1.
Als nächstes wird 'Test.change(i1)' ausgeführt, der Inhalt von i1 (das ist 1) wird in die Variable 'num' kopiert und die Methode change(int) beginnt mit der Ausführung.

'num++;' erhöht den Wert von num um 1, num = 2. Es gibt keine Änderungen am Wert der Variablen 'i1' der main(String[])-Methode, die immer noch 1 enthält.

'System.out.println(num);' gibt 2 auf der Konsole aus.

change(int)-Methode beendet ihre Ausführung und die Steuerung geht zurück zur main(String[])-Methode.

'System.out.println(i1);' gibt 1 auf der Konsole aus.

 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test20 {
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        test20.change(i1);
        System.out.println(i1);
    }
}
