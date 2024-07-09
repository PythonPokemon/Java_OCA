/*
Die Anweisung break beendet die Schleife sofort,
während continue die aktuelle Iteration überspringt und zur nächsten Iteration übergeht:
------------------------------------------------------------------------------------------------------------------------
Ablauf der Schleife
Initialisierung: int i = 0
Bedingung: i < 10
Iterationsschritt: i++
------------------------------------------------------------------------------------------------------------------------
Analyse der Schleife
------------------------------------------------------------------------------------------------------------------------
Iteration 1: i = 0
if (i == 5): false
if (i % 2 == 0): true (0 ist gerade)
continue: Die Schleife geht zur nächsten Iteration (i wird erhöht auf 1), ohne System.out.println(i) auszuführen.

Iteration 2: i = 1
if (i == 5): false
if (i % 2 == 0): false (1 ist ungerade)
System.out.println(i): Ausgabe "1"

Iteration 3: i = 2
if (i == 5): false
if (i % 2 == 0): true (2 ist gerade)
continue: Die Schleife geht zur nächsten Iteration (i wird erhöht auf 3), ohne System.out.println(i) auszuführen.

Iteration 4: i = 3
if (i == 5): false
if (i % 2 == 0): false (3 ist ungerade)
System.out.println(i): Ausgabe "3"

Iteration 5: i = 4
if (i == 5): false
if (i % 2 == 0): true (4 ist gerade)
continue: Die Schleife geht zur nächsten Iteration (i wird erhöht auf 5), ohne System.out.println(i) auszuführen.

Iteration 6: i = 5
if (i == 5): true
break: Die Schleife wird beendet.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Die Schleife führt System.out.println(i) nur aus, wenn i ungerade ist und bevor i den Wert 5 erreicht.
Die Ausgabe erfolgt für die Werte 1 und 3, da:

Bei i = 0, 2, 4 wird die Schleifeniteration mit continue übersprungen.
Bei i = 1, 3 wird System.out.println(i) ausgeführt.
Bei i = 5 wird die Schleife mit break beendet.

Deshalb ist die Ausgabe des Programms:
1
3
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Schleifen;

public class For_Schleife_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Schleife wird beendet
            }
            if (i % 2 == 0) {
                continue; // Nächste Iteration wird fortgesetzt
            }
            System.out.println(i);
        }

    }
}
