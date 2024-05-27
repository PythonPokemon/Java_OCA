/*
* Welche Optionen für den Klassentest, wenn sie zum Ersetzen von INSERT verwendet werden, drucken "Apfel Mango Orange Traube " auf die Konsole?
Einfache Frage zum Iterieren durch das 2-dimensionale Array. Der Startindex sollte 0 und nicht 1 sein.
Die verbesserte for-Schleifensyntax ist korrekt.
Wählen Sie 2 Optionen.

Dieser Code verwendet eine verschachtelte for-each-Schleife, um durch ein zweidimensionales Array von Zeichenfolgen (fruits) zu iterieren und jede Frucht nacheinander auszugeben.
Hier ist eine Erläuterung des Codes:

String[][] fruits = {{"apple", "mango"}, {"orange", "grape"}};: Hier wird ein zweidimensionales Array von Zeichenfolgen mit Früchten initialisiert.
* Jedes innere Array stellt eine Gruppe von Früchten dar.
for (String[] arr : fruits): Dies ist die äußere for-each-Schleife. Sie durchläuft jedes innere Array (arr) im zweidimensionalen Array fruits.
for (String fruit : arr): Dies ist die innere for-each-Schleife. Sie durchläuft jede Frucht (fruit) im aktuellen inneren Array arr.
System.out.print(fruit + " ");: Innerhalb der inneren Schleife wird jede Frucht auf der Konsole ausgegeben, gefolgt von einem Leerzeichen, um zwischen den Früchten Platz zu machen.

Da die äußere Schleife alle inneren Arrays durchläuft und die innere Schleife alle Früchte in jedem inneren Array durchläuft,
werden alle Früchte nacheinander ausgegeben.
Die Ausgabe des Codes wäre:
apple mango orange grape
*
* */
package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test20 {
    public static void main(String[] args) {
        String[][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
        /*INSERT*/


//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
//        for (String[] arr : fruits)
//            for (String fruit : arr)
//                System.out.print(fruit + " ");                      // apple mango orange grape


////Richtige Auswahl
        for (int i = 0; i < fruits.length; i++)
            for (int j = 0; j < fruits[i].length; j++)
                System.out.print(fruits[i][j] + " ");           // apple mango orange grape
//
//----------------------------------------------------------------------------------------------------------------------
//        for (int i = 1; i < fruits.length; i++)
//            for (int j = 1; j < fruits[i].length; j++)
//                System.out.print(fruits[i][j] + " ");         //<-- grape


//        for (int i = 1; i <= fruits.length; i++)
//            for (int j = 1; j <= fruits[i].length; j++)
//                System.out.print(fruits[i][j] + " ");         //<--  java.lang.ArrayIndexOutOfBoundsException:

    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
Ein zweidimensionales Array wird dadurch erkannt, dass es aus mehreren Arrays besteht, die wiederum Elemente enthalten.
In Java wird ein zweidimensionales Array durch die Verwendung von doppelten eckigen Klammern [][] definiert.

Hier sind einige Merkmale eines zweidimensionalen Arrays in Java:

Verwendung von zwei Dimensionen: Ein zweidimensionales Array hat zwei Dimensionen.
Das bedeutet, dass es in Zeilen und Spalten organisiert ist.

Array von Arrays: Technisch gesehen ist ein zweidimensionales Array ein Array, das aus anderen Arrays besteht.
Jedes dieser Arrays in der äußeren Arrayhülle repräsentiert eine Zeile des zweidimensionalen Arrays.

Zugriff auf Elemente: Elemente in einem zweidimensionalen Array werden über zwei Indizes angesprochen.
Der erste Index bezeichnet die Zeile, während der zweite Index die Spalte angibt.

Initialisierung: Die Initialisierung eines zweidimensionalen Arrays erfolgt durch die Angabe von Werten für jede Zeile und jede Spalte.
Dies kann durch eine Array-Initialisierungsliste oder durch Zuweisung einzelner Werte erfolgen.
* */