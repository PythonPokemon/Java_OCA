/*

In Java kann es bei Überladungen von Methoden zu unterschiedlichen Ergebnissen kommen,
je nachdem welche Argumente an die Methode übergeben werden und wie der Compiler die beste Übereinstimmung der Methoden ermittelt.
In deinem Beispiel wird die Methode add überladen, einmal für primitive double-Typen und einmal für die Wrapper-Klasse Double.

Hier passiert Folgendes:

10.0 ist ein primitiver double.
new Integer(10) ist ein Integer-Objekt.
Auflösung der Überladung:
Beim Aufruf add(10.0, new Integer(10)); gibt es zwei Möglichkeiten:

add(double d1, double d2)
add(Double d1, Double d2)
------Der Compiler versucht, die beste Übereinstimmung zu finden. Hier sind die Schritte, die er dabei unternimmt:------

Prüfung der Argumenttypen:

Der erste Parameter 10.0 passt direkt zum primitiven double und auch zur Double-Klasse durch Autoboxing.
Der zweite Parameter new Integer(10) passt direkt zur Integer-Klasse und könnte durch Autoboxing zu Double konvertiert werden,
da Integer in einen primitiven int und dieser in einen primitiven double konvertiert werden kann.
Priorität der Konvertierungen:

Der Compiler bevorzugt die direkteste Übereinstimmung der Parameter.
Da double der genauere Typ für 10.0 ist und Integer zu int und dann zu double konvertiert werden kann,
wählt der Compiler die Methode add(double d1, double d2).
Konvertierungsschritte:

10.0 bleibt double.
new Integer(10) wird zu int, dann zu double.
Da der Compiler die Methode mit primitiven double-Typen bevorzugt und new Integer(10) in einen primitiven double umgewandelt werden kann,
wird die Methode add(double d1, double d2) aufgerufen.
 * */

package JAVA_OCA_Test_2.Aufgaben_1_bis_9;

public class test4 {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, new Integer(10)); // .NullPointerException wenn | add(10.0, null)
    }
}
