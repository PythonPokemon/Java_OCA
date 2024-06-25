/*
Erklärung:
Definition der Klassen:

Oberklasse: Basisklasse mit einer Methode print.
Unterklasse: Abgeleitete Klasse, die die print-Methode überschreibt.
Array-Deklaration und Zuweisung:

Unterklasse[] unterArray = new Unterklasse[10];: Ein Array von Unterklasse-Objekten wird erstellt.
Oberklasse[] oberArray = unterArray;: Das Unterklasse-Array wird einem Oberklasse-Array zugewiesen.
Dies ist aufgrund der Kovarianz von Arrays in Java erlaubt.
Initialisierung der Array-Elemente:

Jedes Element des unterArray wird mit einer neuen Instanz von Unterklasse initialisiert.
Zugriff auf das Array:

Über das Oberklasse-Array wird auf die Elemente zugegriffen und die print-Methode aufgerufen.
Da die tatsächlichen Objekte Unterklasse-Instanzen sind, wird die print-Methode der Unterklasse aufgerufen.
Laufzeitfehler (ArrayStoreException):

Es wird versucht, ein Oberklasse-Objekt in das Unterklasse-Array einzufügen, was zu einem Laufzeitfehler führt.
Dieser Fehler wird durch eine ArrayStoreException angezeigt,
da ein Oberklasse-Objekt nicht in ein Array eingefügt werden kann, das tatsächlich Unterklasse-Objekte erwartet.
Dieses Beispiel zeigt die Kovarianz von Arrays und die potenziellen Risiken,
die damit verbunden sind, wenn Typen zur Laufzeit nicht kompatibel sind.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

class Oberklasse1a {
    public void print() {
        System.out.println("Ich bin die Oberklasse");
    }
}

class Unterklasse1a extends Oberklasse1a {
    @Override
    public void print() {
        System.out.println("Ich bin die Unterklasse");
    }
}
// 7.4.5 Array-Typen und Kovarianz
public class ArrayKovarianz {
    public static void main(String[] args) {
        Unterklasse1a[] unterArray = new Unterklasse1a[10];
        Oberklasse1a[] oberArray = unterArray;

        // Initialisierung der Elemente des Arrays
        for (int i = 0; i < unterArray.length; i++) {
            unterArray[i] = new Unterklasse1a();
        }

        // Zugriff auf das Array über das Oberklasse-Array
        for (Oberklasse1a element : oberArray) {
            element.print();
        }

        // Dies verursacht einen Laufzeitfehler (ArrayStoreException)
        try {
            oberArray[0] = new Oberklasse1a(); // Einfügen eines Oberklasse-Objekts in das Unterklasse-Array
        } catch (ArrayStoreException e) {
            System.out.println("Laufzeitfehler: " + e.getMessage());
        }
    }
}
