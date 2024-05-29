/*
Code-Analyse
1.Array-Initialisierung:

Object[] arr = new Object[4];
Es wird ein Array arr mit 4 Elementen erstellt, das Object-Referenzen speichert. Alle Elemente sind zunächst null.
------------------------------------------------------------------------------------------------------------------------
2.Befüllen des Arrays mit einer Schleife:


for (int i = 1; i <= 3; i++) {
    switch (i) {
        case 1:
            arr[i] = new String("Java");
            break;
        case 2:
            arr[i] = new StringBuilder("Java");
            break;
        case 3:
            arr[i] = new SpecialString("Java");
            break;
    }
}

Die Schleife durchläuft die Werte 1 bis 3 und fügt basierend auf dem Wert von i verschiedene Objekte in das Array arr ein:

i = 1: arr[1] wird auf ein String-Objekt "Java" gesetzt.
i = 2: arr[2] wird auf ein StringBuilder-Objekt "Java" gesetzt.
i = 3: arr[3] wird auf ein SpecialString-Objekt "Java" gesetzt.
------------------------------------------------------------------------------------------------------------------------
3.Ausgabe des Arrays:

for (Object obj : arr) {
    System.out.println(obj);    // <-- was kommt raus?
}
Nun wird jedes Element des Arrays arr ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Ergebnis-Analyse
1.Erstes Element (arr[0]):
Da arr[0] nie initialisiert wurde, bleibt es null.
null

2.Zweites Element (arr[1]):
arr[1] ist ein String-Objekt mit dem Wert "Java". Die toString()-Methode von String wird aufgerufen.
Java

3.Drittes Element (arr[2]):
arr[2] ist ein StringBuilder-Objekt mit dem Wert "Java". Die toString()-Methode von StringBuilder gibt den Inhalt zurück.
Java

4.Viertes Element (arr[3]):
arr[3] ist ein SpecialString-Objekt mit dem Wert "Java".
Da SpecialString die toString()-Methode von Object nicht überschreibt, wird die Standardimplementierung verwendet,
die den Klassennamen und die Hashcode-Repräsentation des Objekts zurückgibt.
JAVA_OCA_Test_1.Aufgaben_40_bis_49.SpecialString@5f184fc6
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung des Ergebnisses:

null
Java
Java
JAVA_OCA_Test_1.Aufgaben_40_bis_49.SpecialString@5f184fc6

null: Das erste Element des Arrays wurde nicht initialisiert.
Java: Die String- und StringBuilder-Objekte geben ihren Inhalt korrekt zurück.
JAVA_OCA_Test_1.Aufgaben_40_bis_49.SpecialString@5f184fc6:
Das SpecialString-Objekt verwendet die Standardimplementierung von toString(),
weil die Methode in dieser Klasse nicht überschrieben wurde.
* */

package JAVA_OCA_Test_1.Aufgaben_40_bis_49;

class SpecialString {
    String str;

    SpecialString(String str) {
        this.str = str;
    }
}

public class tst48 {
    public static void main(String[] args) {
        Object[] arr = new Object[4];

        for (int i = 1; i <= 3; i++) {
            switch (i) {                                    // case 0: null, da dem index keinen wert zugewiesen
                case 1:
                    arr[i] = new String("Java");    // case 1: Java element
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");    // case 2: Java element
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");    // case 3: Speicheradresse @Symbol
                    break;
            }
        }
        for (Object obj : arr) {
            System.out.println(obj);    // <-- was kommt raus?
        }
    }
}
