/*
Schritt-für-Schritt-Analyse
Deklaration des Java_Anfänger_zum_Profi.Arrays:

static Boolean[] arr = new Boolean[1];
Hier wird ein Array von Boolean-Objekten mit einer Länge von 1 deklariert.
Da es sich um ein Array von Objekten handelt, werden die Elemente des Java_Anfänger_zum_Profi.Arrays automatisch auf null gesetzt.
Das bedeutet, arr[0] ist null.
------------------------------------------------------------------------------------------------------------------------
Hauptmethode:

public static void main(String[] args) {
    if(arr[0]) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
}
In der main-Methode wird versucht, den Wert von arr[0] zu überprüfen.

Hier passiert Folgendes:

arr[0] ist null, da das Array nur deklariert wurde und keine Werte zugewiesen wurden.
Der Ausdruck if(arr[0]) versucht, das Boolean-Objekt arr[0] in einen primitiven boolean-Wert umzuwandeln,
um die Bedingung zu evaluieren.

Warum tritt die NullPointerException auf?
------------------------------------------------------------------------------------------------------------------------
In Java führt der Versuch, ein null-Objekt in einen primitiven Typ zu konvertieren, zu einer NullPointerException.
------------------------------------------------------------------------------------------------------------------------
Im Detail passiert Folgendes:

Der Ausdruck if(arr[0]) versucht, arr[0] (welches null ist) in einen boolean-Wert zu konvertieren.
Da arr[0] null ist, kann die Autoboxing-Konvertierung (Boolean zu boolean) nicht durchgeführt werden,
und es wird eine NullPointerException geworfen.* */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test8 {
    static Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {
        if(arr[0]) {                    // arr[0] ist kein Boolean wert deswegen | .NullPointerException
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
/*
Lösungsmöglichkeiten
Um die NullPointerException zu vermeiden, musst du sicherstellen, dass arr[0] einen gültigen Boolean-Wert
(entweder true oder false) enthält, bevor du darauf zugreifst. Hier sind einige Möglichkeiten, dies zu erreichen:

Initialisierung des Java_Anfänger_zum_Profi.Arrays mit einem gültigen Boolean-Wert:

static Boolean[] arr = new Boolean[]{Boolean.FALSE};
Überprüfung auf null vor dem Zugriff:

public static void main(String[] args) {
    if(arr[0] != null && arr[0]) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
}
Durch eine dieser Änderungen wird sichergestellt, dass der Code nicht versucht, ein null-Objekt
in einen primitiven boolean-Wert zu konvertieren, und somit eine NullPointerException vermieden wird.
* */
