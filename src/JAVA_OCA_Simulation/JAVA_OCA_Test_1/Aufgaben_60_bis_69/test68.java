/*
* Im Code wird ein StringBuilder-Objekt sb erstellt und mit dem Inhalt "Java" initialisiert.
* Dann werden zwei Strings s1 und s2 erstellt, die jeweils den Inhalt von sb als Zeichenfolge enthalten.
*
* Der Ausdruck s1 == s2 vergleicht jedoch nicht den Inhalt der Zeichenfolgen, sondern prüft, ob s1 und s2 auf dasselbe Objekt im Speicher verweisen.
* Da bei der Konvertierung von StringBuilder zu String ein neues String-Objekt erzeugt wird, zeigen s1 und s2 auf unterschiedliche String-Objekte, selbst wenn ihre Inhalte gleich sind.
*
* Daher wird der Ausdruck s1 == s2 zu false ausgewertet, da die beiden Referenzen auf unterschiedliche Objekte im Speicher verweisen.
* Um den Inhalt von s1 und s2 zu vergleichen, solltest du die equals()-Methode verwenden:
* Dieser Ausdruck vergleicht die Inhalte der Zeichenfolgen s1 und s2 und gibt true aus, wenn die Inhalte gleich sind.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_60_bis_69;

public class test68 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);   // was kommt raus? false
//----------------------------------------------------------------------------------------------------------------------
        // Variante 2 | equals()-Methode verwenden
        System.out.println(s1.equals(s2)); // true

    }
}
