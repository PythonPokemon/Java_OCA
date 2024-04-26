package LF11aV2_LZK_JAVA;

/* Code Beschreibung.
 * Dieses Java-Programm demonstriert die Zuweisung von Werten zwischen verschiedenen Datentypen und die damit verbundenen Compilerfehler.
 * Die Variable "f3" wird als Gleitkommazahl (float) deklariert und der Wert 100 zugewiesen, was zulässig ist, da 100 als Ganzzahl automatisch in eine Gleitkommazahl umgewandelt wird.
 * Die Variable "d1" wird als Gleitkommazahl mit doppelter Genauigkeit (double) deklariert und der Wert 203.22 zugewiesen.
 * Es wird versucht, den Wert der double-Variablen "d1" in eine float-Variablen "f1" ohne explizite Typumwandlung zuzuweisen, was zu einem Compilerfehler führt, da eine implizite Konvertierung von double zu float möglicherweise Genauigkeitsverlust verursachen könnte.
 * Die Variable "i5" wird als Ganzzahl (int) deklariert und dem Wert 100 zugewiesen.
 * Die Variable "f5" wird als Gleitkommazahl (float) deklariert und dem Wert der Ganzzahl-Variablen "i5" zugewiesen. Da eine explizite Typumwandlung durchgeführt wird, erfolgt die Zuweisung ohne Fehler.
 * Die Variable "f2" wird als Gleitkommazahl (float) deklariert und dem Wert 111.00 zugewiesen. Die Angabe "(float)" vor dem Wert dient dazu, den Wert explizit in einen Float zu konvertieren.
 * Die Variable "f4" wird als Gleitkommazahl (float) deklariert und dem Wert 100F zugewiesen, was eine gültige Art ist, eine Gleitkommazahl mit dem Suffix "F" zu kennzeichnen.
 *
 * Die Ausgabe dieses Programms wird sein:
 * 100.0
 * 203.22
 * Compiler fehler
 * 100
 * 100.0
 * 111.0
 * 100.0
 * */
public class LZK9 {
    public static void main(String[] args) {
        float f3 = 100;
        double d1 = 203.22;
//        float f1 = d1;  // compilerfehler | da d1 schon bei double deklariert und ein wert zugewiesen wurde!
        int i5 = 100;
        float f5 = (float) i5;
        float f2 = (float) 1_11.00;
        float f4 = 100F;

        System.out.println(f3);
        System.out.println(d1);
//        System.out.println(f1);
        System.out.println(i5);
        System.out.println(f5);
        System.out.println(f2);
        System.out.println(f4);

    }
}
