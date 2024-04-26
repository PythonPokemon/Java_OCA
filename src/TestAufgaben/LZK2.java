package TestAufgaben;

/* Code Beschreibung.
 * In diesem Java-Code wird eine Klasse "LZK2" definiert, die eine Methode "disp()" enthält, aber keine explizite Zuweisung für das Attribut "i" vornimmt.
 * Dies bedeutet, dass es sich um das Standardverhalten handelt, bei dem das Attribut standardmäßig auf den Wert 0 gesetzt wird.
 * Die Methode "disp()" enthält eine while-Schleife, die so lange ausgeführt wird, wie "i" kleiner oder gleich 5 ist.
 * Innerhalb dieser Schleife befindet sich eine for-Schleife, die von 1 bis 5 läuft und dabei die Zahlen 1 bis 5 ausgibt.
 * Beachte, dass die for-Schleife eine lokale Variable "i" verwendet, die unabhängig von der Klassen variablen "i" ist.
 * Die Methode "disp()" wird dann in der "main" Methode aufgerufen, indem eine neue Instanz von "LZK2" erstellt wird und die Methode "disp()" auf dieser Instanz aufgerufen wird.
 * Die Ausgabe dieses Programms wird sein: "1 2 3 4 5" (sechs Mal hintereinander). Das liegt daran, dass die while-Schleife solange läuft, wie "i" kleiner oder gleich 5 ist.
 * Innerhalb der while-Schleife wird die for-Schleife ausgeführt, die die Zahlen von 1 bis 5 ausgibt, und dann wird "i" inkrementiert.
 * Nachdem "i" größer als 5 ist, wird die while-Schleife beendet und das Programm endet.
 * */
public class LZK2 {

    private int i;

    void disp() {
        while (i <= 5) {    // startet bei durchlauf 0, 1, 2, 3, 4, 5 = die Schleife wird also 6x mal durchlaufen
            for (int i = 1; i <= 5; ) { // zählt von 1 hoch bis 5
                System.out.print(i + " ");  //  Printed 6x 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5 | 1 2 3 4 5
                i++; // Die Verwendung von "i++" innerhalb der for-Schleife erhöht die lokale Variable "i" um 1 und ermöglicht es der Schleife, von 1 bis 5 zu zählen.
            }
            i++;    // Die Verwendung von "i++" außerhalb der for-Schleife erhöht die Instanzvariable "i" um 1 und steuert die Bedingung der while-Schleife, die bestimmt, wie oft die for-Schleife durchlaufen wird.
        }
    }

    public static void main(String[] args) {
        new LZK2().disp();
    }
}