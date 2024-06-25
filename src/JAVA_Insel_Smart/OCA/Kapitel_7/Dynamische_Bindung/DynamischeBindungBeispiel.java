/*
Dynamische Bindung und toString() in Java
In Java ist die dynamische Bindung ein Mechanismus, bei dem die Methode zur Laufzeit auf Basis
des tatsächlichen Objekttyps aufgerufen wird, nicht auf Basis des deklarierten Typs der Variablen.
Dies ist insbesondere bei Methoden wie toString() wichtig, die oft in Unterklassen überschrieben werden,
um eine spezifische Darstellung des Objekts zu bieten.
------------------------------------------------------------------------------------------------------------------------
Erklärung
1.Definition der Klassen:

Oberklasse: Enthält eine Überschreibung der toString()-Methode, die den String "Oberklasse" zurückgibt.
Unterklasse: Erbt von Oberklasse und überschreibt die toString()-Methode, um den String "Unterklasse" zurückzugeben.
------------------------------------------------------------------------------------------------------------------------
2.Erstellen von Objekten:

Oberklasse obj1 = new Oberklasse();: Erstellt ein Objekt der Oberklasse.
Oberklasse obj2 = new Unterklasse();: Erstellt ein Objekt der Unterklasse, das jedoch als Oberklasse referenziert wird.
------------------------------------------------------------------------------------------------------------------------
3.Dynamische Bindung:

Bei System.out.println(obj1.toString()); wird die toString()-Methode der Oberklasse aufgerufen,
da obj1 eine Instanz von Oberklasse ist.

Bei System.out.println(obj2.toString()); wird die toString()-Methode der Unterklasse aufgerufen,
obwohl obj2 als Oberklasse deklariert ist. Dies liegt daran,
dass das tatsächliche Objekt zur Laufzeit eine Instanz der Unterklasse ist.
------------------------------------------------------------------------------------------------------------------------
was bringt es denn wenn die oberklasse sich selbst sicher überschreibt?
Wenn die Oberklasse ihre eigene Methode, wie toString(), überschreibt, hat das mehrere Vorteile:

1.Konsistente Darstellung:

Eine standardisierte String-Darstellung für Instanzen der Oberklasse kann sehr nützlich sein,
insbesondere für Debugging, Logging oder andere Zwecke, bei denen eine konsistente
und aussagekräftige Darstellung der Objekte benötigt wird.
------------------------------------------------------------------------------------------------------------------------
2.Vererbung:

Wenn die Methode toString() in der Oberklasse überschrieben wird,
wird diese Implementierung automatisch an alle Unterklassen vererbt.
Unterklassen können die Methode dann überschreiben, um eine spezifischere Darstellung zu bieten,
oder die Implementierung der Oberklasse verwenden, wenn keine spezifischere Darstellung benötigt wird.
------------------------------------------------------------------------------------------------------------------------
3.Ermöglichung von Polymorphismus:

Durch das Überschreiben der Methode in der Oberklasse können polymorphe Aufrufe konsistent behandelt werden.
Unabhängig davon, ob eine Instanz als Oberklasse oder Unterklasse referenziert wird,
wird immer die korrekte toString()-Methode zur Laufzeit aufgerufen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Dynamische_Bindung;

class Oberklasse {
    @Override
    public String toString() {
        return "Oberklasse";
    }
}

class Unterklasse extends Oberklasse2 {
    @Override
    public String toString() {
        return "Unterklasse";
    }
}

public class DynamischeBindungBeispiel {
    public static void main(String[] args) {
        Oberklasse2 obj1 = new Oberklasse2();
        Oberklasse2 obj2 = new Unterklasse2();

        System.out.println(obj1.toString()); // Gibt "Oberklasse" aus
        System.out.println(obj2.toString()); // Gibt "Unterklasse" aus
    }
}
