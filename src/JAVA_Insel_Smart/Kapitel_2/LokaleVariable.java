/*
Initialisierung von lokalen Variablen

Lokale Variablen müssen initialisiert werden, bevor sie verwendet werden.
Andernfalls führt dies zu einem Compiler-Fehler:
int zahl;
zahl = 5; // Initialisierung
------------------------------------------------------------------------------------------------------------------------
Instanzvariablen sind Variablen, die innerhalb einer Klasse,
aber außerhalb einer Methode deklariert werden und zu einer Instanz der Klasse gehören.
* */
package JAVA_Insel_Smart.Kapitel_2;

// Beispiel 1: Initialisierung und Verwendung innerhalb einer Methode
public class LokaleVariable {
    public static void main(String[] args) {
        int zahl1; // Deklaration der lokalen Variablen
        zahl1 = 5; // Initialisierung der lokalen Variablen
        System.out.println(zahl1); // Verwendung der initialisierten Variablen
    }

    // Beispiel 2: Initialisierung innerhalb eines Blocks
    public static void main2(String[] args) {
        if (true) {
            int zahl2 = 10; // Deklaration und Initialisierung innerhalb eines Blocks
            System.out.println(zahl2); // Verwendung der initialisierten Variablen
        }
        // Zahl ist außerhalb des Blocks nicht sichtbar
    }

    //// Beispiel 3: Fehler bei nicht initialisierter Verwendung
//    public static void main3(String[] args) {
//        int zahl3; // Deklaration der lokalen Variablen
//        System.out.println(zahl3); // Fehler: Variable 'zahl' might not have been initialized
//    }
    public static void main4(String[] args) {
        for (int i = 0; i < 10; i++) {
            int zahl4 = i * 2; // Deklaration und Initialisierung innerhalb der Schleife
            System.out.println(zahl4); // Verwendung der initialisierten Variablen
        }
    }
}
/*
Zusammenfassung
Deklaration: Eine lokale Variable wird mit einem Datentyp und einem Namen deklariert.
Initialisierung: Eine lokale Variable muss vor ihrer ersten Verwendung einen Wert zugewiesen bekommen.
Verwendung: Nach der Initialisierung kann die lokale Variable innerhalb ihres Gültigkeitsbereichs verwendet werden.
Das Nicht-Initialisieren einer lokalen Variablen vor ihrer Verwendung führt zu einem Compiler-Fehler,
da Java keine Standardwerte für lokale Variablen vergibt.
* */
