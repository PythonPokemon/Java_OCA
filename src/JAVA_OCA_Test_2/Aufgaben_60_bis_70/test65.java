/*
 Wird obiger Code erfolgreich kompiliert? = Ja

Gesamterklärung
Aus Gründen der Lesbarkeit wird der Unterstrich (_) verwendet, um numerische Werte zu trennen.
Dies ist sehr nützlich, um große Zahlen wie Kreditkartennummern (1234_7654_9876_0987) darzustellen.
Long-Daten können mit L, Float mit F und Double mit D versehen werden.
Die ersten 5 Variablendeklarations- und Zuweisungsanweisungen in der main(String [])-Methode verursachen also keinen Kompilierungsfehler.

Schauen wir uns den Rest der Aussagen an:

l = c + i; => Die linke Variable 'l' ist vom Typ long und der Ausdruck auf der rechten Seite wird zu einem int-Wert ausgewertet,
der leicht dem Typ long zugewiesen werden kann. Hier gibt es keinen Kompilierungsfehler.

f = c * l * i * f; => Die linke Variable 'f' ist vom Typ float und der Ausdruck auf der rechten Seite wird zum float-Wert ausgewertet,
der leicht dem float-Typ zugewiesen werden kann. Daher wird es erfolgreich kompiliert.

f = l + i + c; => Die Variable 'f' auf der linken Seite ist vom Typ float und der Ausdruck auf der rechten Seite
wird als long-Wert ausgewertet, der leicht dem float-Typ zugewiesen werden kann. Daher gibt es hier keine Probleme.

i = (int)d; => double kann int nicht ohne explizite Umwandlung zugewiesen werden,
der Ausdruck '(int)d;' auf der rechten Seite wandelt double in int um, also keine Probleme.

f = (lang)d; => double kann float nicht ohne explizite Umwandlung zugewiesen werden,
der rechte Ausdruck '(long)d;' wandelt double in long um, was leicht dem float-Typ zugewiesen werden kann.

Es wird erfolgreich kompiliert.
 * */
package JAVA_OCA_Test_2.Aufgaben_60_bis_70;

public class test65 {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
    }
}
