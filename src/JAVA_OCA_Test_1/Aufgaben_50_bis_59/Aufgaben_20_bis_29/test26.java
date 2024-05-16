/*
*   Was in dieser Zeile passiert, ist, dass der Wert von str2 der Variable str1 zugewiesen wird,
*   und dann der zugewiesene Wert von str1 (also der Wert von str2) als Argument an System.out.println() übergeben wird.
*
* Da der Zuweisungsoperator = in Java den Wert der rechten Seite der Zuweisung (str2) der linken Seite (str1) zuweist
* und dann den zugewiesenen Wert zurückgibt, wird in diesem Fall der Wert von str2 auf str1 zugewiesen,
* und dann gibt der Ausdruck str2 (also der Wert von str2) zurück.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_20_bis_29;

public class test26 {
    public static void main(String[] args) {

        // Variante 1
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);        // <-- Was, kommt raus? | zuweisungsoperator

        // Variante 2 | wo ist der Unterschied?
        String str3 = new String("Core");
        String str4 = new String("CoRe");
        System.out.println(str3 == str4);        // <-- Was, kommt raus? | vergleichsoperator
    }
}
