/*
 Initialisierung des Arrays:

String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
Das zweidimensionale Array arr wird initialisiert. Es enthält drei Arrays:

{"7", "6", "5"}
{"4", "3"}
{"2", "1"}
------------------------------------------------------------------------------------------------------------------------
Äußere Schleife:

for (int i = 0; i < arr.length; i++) { //Line n1
Diese Schleife iteriert über die Zeilen des Arrays arr.
------------------------------------------------------------------------------------------------------------------------
Innere Schleife:

for (int j = 0; j < arr[i].length; j++) { //Line n2
Diese Schleife iteriert über die Elemente in der aktuellen Zeile arr[i].
------------------------------------------------------------------------------------------------------------------------
Switch-Statement:

switch (arr[i][j]) { //Line n3
    case "2":
    case "4":
    case "6":
        break; //Line n4
    default:
        continue; //Line n5
}
Das Switch-Statement überprüft den Wert von arr[i][j].
------------------------------------------------------------------------------------------------------------------------
Auswertung der Switch-Cases:

Wenn arr[i][j] "2", "4" oder "6" ist, trifft einer der case-Blöcke zu und der break-Befehl wird ausgeführt.
Dadurch wird die innere Schleife verlassen und System.out.print(arr[i][j]); wird ausgeführt.

Wenn der Wert nicht "2", "4" oder "6" ist, trifft der default-Fall zu und continue wird ausgeführt,
wodurch der Rest der Schleife übersprungen wird und die nächste Iteration der inneren Schleife gestartet wird.
------------------------------------------------------------------------------------------------------------------------
Print-Anweisung:

System.out.print(arr[i][j]); //Line n6
Diese Zeile wird nur erreicht, wenn einer der case-Blöcke getroffen wird und der break-Befehl ausgeführt wurde.
------------------------------------------------------------------------------------------------------------------------
Schauen wir uns nun den Ablauf der Schleifen an:

Erste Zeile: {"7", "6", "5"}
j = 0: arr[0][0] ist "7". Es trifft den default-Fall und continue wird ausgeführt. (7 wird nicht ausgegeben)
j = 1: arr[0][1] ist "6". Es trifft den case "6":-Block, break wird ausgeführt und "6" wird ausgegeben.
j = 2: arr[0][2] ist "5". Es trifft den default-Fall und continue wird ausgeführt. (5 wird nicht ausgegeben)

Zweite Zeile: {"4", "3"}
j = 0: arr[1][0] ist "4". Es trifft den case "4":-Block, break wird ausgeführt und "4" wird ausgegeben.
j = 1: arr[1][1] ist "3". Es trifft den default-Fall und continue wird ausgeführt. (3 wird nicht ausgegeben)

Dritte Zeile: {"2", "1"}
j = 0: arr[2][0] ist "2". Es trifft den case "2":-Block, break wird ausgeführt und "2" wird ausgegeben.
j = 1: arr[2][1] ist "1". Es trifft den default-Fall und continue wird ausgeführt. (1 wird nicht ausgegeben)

Zusammengefasst wird nur "6", "4" und "2" ausgegeben. Daher lautet die endgültige Ausgabe: 642
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung der Logik:
Das switch-Statement filtert bestimmte Werte ("2", "4", "6") und lässt nur diese Werte ausgeben.
Der break-Befehl sorgt dafür, dass die System.out.print-Anweisung erreicht wird,
während continue die Schleifeniteration überspringt.
 * */

package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test24 {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}
