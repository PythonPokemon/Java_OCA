/*
Detaillierte Erklärung
------------------------------------------------------------------------------------------------------------------------
1. Klasse und Konstruktor

public class Punkt {
    private int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Klasse Punkt: Diese Klasse repräsentiert einen Punkt im zweidimensionalen Raum mit den Koordinaten x und y.
Konstruktor: Der Konstruktor initialisiert die x- und y-Koordinaten eines Punktes.
------------------------------------------------------------------------------------------------------------------------
2. Überschreiben der equals-Methode

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Punkt punkt = (Punkt) obj;
    return x == punkt.x && y == punkt.y;
}
------------------------------------------------------------------------------------------------------------------------
@Override:
Dieses Annotation zeigt an, dass die Methode equals der Object-Klasse überschrieben wird.
------------------------------------------------------------------------------------------------------------------------
public boolean equals(Object obj):
Die Methode prüft, ob das aktuelle Objekt (this) gleich dem angegebenen Objekt (obj) ist.
------------------------------------------------------------------------------------------------------------------------
if (this == obj):

Dieser Vergleich überprüft, ob this (das aktuelle Objekt) und obj auf dasselbe Objekt verweisen.
Wenn ja, sind die Objekte identisch, und die Methode gibt true zurück.
Beispiel: Punkt p1 = new Punkt(1, 2); p1.equals(p1); gibt true zurück.
------------------------------------------------------------------------------------------------------------------------
if (obj == null || getClass() != obj.getClass()):

Dieser Vergleich überprüft zwei Dinge:
1.Ob das angegebene Objekt obj null ist. Wenn ja, können die Objekte nicht gleich sein,
und die Methode gibt false zurück.

2.Ob das angegebene Objekt obj von einer anderen Klasse ist als das aktuelle Objekt (this).
Wenn ja, sind die Objekte nicht vom gleichen Typ, und die Methode gibt false zurück.

Beispiel: Punkt p1 = new Punkt(1, 2); p1.equals(null); gibt false zurück.
------------------------------------------------------------------------------------------------------------------------
Punkt punkt = (Punkt) obj:

An dieser Stelle wissen wir, dass obj nicht null ist und dass obj eine Instanz der Klasse Punkt ist.
Daher können wir obj sicher in Punkt umwandeln.
Dies ermöglicht den Zugriff auf die x- und y-Attribute des obj-Objekts.
------------------------------------------------------------------------------------------------------------------------
return x == punkt.x && y == punkt.y:

Hier werden die x- und y-Werte des aktuellen Objekts (this) mit den x- und y-Werten
des angegebenen Objekts (obj, das in punkt umgewandelt wurde) verglichen.

Wenn beide Wertepaare gleich sind, gibt die Methode true zurück, andernfalls false.

Beispiel:
Punkt p1 = new Punkt(1, 2); Punkt p2 = new Punkt(1, 2); p1.equals(p2); gibt true zurück, da die x- und y-Werte gleich sind.
------------------------------------------------------------------------------------------------------------------------
3. Testen der equals-Methode

public static void main(String[] args) {
    Punkt p1 = new Punkt(1, 2);
    Punkt p2 = new Punkt(1, 2);
    System.out.println(p1.equals(p2));  // Gibt true aus
}

Hauptmethode: Erstellt zwei Punkt-Objekte mit den gleichen Koordinaten (x = 1, y = 2) und prüft, ob sie gleich sind.
Ausgabe: System.out.println(p1.equals(p2)); gibt true aus, da die x- und y-Werte beider Punkt-Objekte gleich sind.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung

Identität vs. Gleichheit:
Die Standardimplementierung von equals prüft, ob zwei Referenzen auf dasselbe Objekt zeigen.
Durch Überschreiben der equals-Methode können Sie die inhaltliche Gleichheit von Objekten überprüfen.

equals-Methode:
Beim Überschreiben der equals-Methode sollten Sie sicherstellen, dass sie reflexiv, symmetrisch, transitiv,
konsistent und gegen null robust ist.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.equals_Methode;

// Richtige Verwendung der equals-Methode durch Überschreiben
public class Punkt {
    private int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Punkt punkt = (Punkt) obj;
        return x == punkt.x && y == punkt.y;
    }

    public static void main(String[] args) {
        Punkt p1 = new Punkt(1, 2);
        Punkt p2 = new Punkt(1, 2);
        System.out.println(p1.equals(p2));  // Gibt true aus
    }
}
