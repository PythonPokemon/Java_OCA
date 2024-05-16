/*
.NullPointerException

Gesamterklärung
Um die spezielle main-Methode aufzurufen, lädt JVM die Klasse in den Speicher.
Zu diesem Zeitpunkt werden statische Felder der Testklasse initialisiert. d1 ist vom Typ Double, daher wird ihm null zugewiesen.

x ist auch eine statische Variable, also d1.intValue(); ausgeführt wird und da d1 null ist, löst d1.intValue()
eine NullPointerException aus, und als Ergebnis wird eine Instanz von java.lang.ExceptionInInitializerError geworfen.

 * */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;

public class test18 {
    static Double d1;
    static int x = d1.intValue();

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
