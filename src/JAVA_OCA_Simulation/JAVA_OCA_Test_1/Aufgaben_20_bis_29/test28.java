/*
* In Java sind Zeichenketten-Literale_OCA, die bei der Kompilierung bekannt sind, intern im sogenannten "String-Pool" gespeichert.
* Das bedeutet, wenn Sie zwei Zeichenketten-Literale_OCA mit demselben Inhalt erstellen, zeigt sowohl s1 als auch s2 auf dasselbe Objekt im Speicher.
*
* In diesem Beispiel sind s1 und s2 tatsächlich gleich, da s2 durch die Verkettung des Zeichenketten-Literals "OCAJP" mit einer leeren Zeichenkette "" erstellt wurde.
* Diese Verkettung führt dazu, dass der Compiler den Ausdruck "OCAJP" + "" zu "OCAJP" vereinfacht, was identisch mit dem Inhalt von s1 ist.
*
* Wenn Sie den == Operator auf Zeichenketten verwenden, vergleichen Sie die Referenzen der Objekte im Speicher.
* Da s1 und s2 auf dasselbe Objekt im String-Pool zeigen, wird true zurückgegeben.
*
* Jedoch, wenn Sie den Inhalt der Zeichenketten vergleichen möchten, sollten Sie die Methode equals() verwenden, da diese den Inhalt der Zeichenketten vergleicht, nicht die Referenzen:
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_20_bis_29;

public class test28 {
    public static void main(String[] args) {

        // Variante 1
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);           // <-- was, kommt raus?

//----------------------------------------------------------------------------------------------------------------------

        // Variante 2
        String s3 = "OCAJP";
        String s4 = "OCAJP" + "";
        boolean test = (s3 == s4);
        System.out.println(test);               // <-- was, kommt raus?

//----------------------------------------------------------------------------------------------------------------------

        // Variante 3
        String s5 = "OCAJP";
        String s6 = "OCAJP" + "";
        String s7 = "Variante 3 ist: ";
        System.out.println(s7 + s5.equals(s6));  // <-- was, kommt raus?

//----------------------------------------------------------------------------------------------------------------------

        // Variante 4
        String s8 = "OCAJP";
        String s9 = "OCAJP" + ":";
        String s10 = "Variante 4 ist: ";
        System.out.println(s10 + s8.equals(s9));  // <-- was, kommt raus?
    }
}
