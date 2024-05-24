/*
 * Gesamterklärung
equals(String str) der String-Klasse stimmt mit zwei String-Objekten überein und berücksichtigt die Groß-/Kleinschreibung des Charakters beim Abgleich.

Alphabet A in Großbuchstaben und Alphabet A in Kleinbuchstaben sind nach dieser Methode nicht gleich.

Da String-Objekte, auf die von s1 und s2 verwiesen wird, unterschiedliche Fälle haben, ist die Ausgabe false.
 * */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;

public class test42 {
    public static void main(String[] args) {
        String s1 = "OcA";
        String s2 = "oCa";
        System.out.println(s1.equals(s2));  //nein da unterschiedlihe String LIteral inhalte
    }
}
