/*
Hier ist ein einfaches Beispiel, das die automatische und explizite Typumwandlung
(Upcasting und Downcasting) in Java erklärt und zeigt, wie diese in Hierarchien verwendet werden.
------------------------------------------------------------------------------------------------------------------------
Erklärung:
Klasse Oberklasse:

Enthält eine Methode printInfo(), die eine Nachricht ausgibt.
Klasse Unterklasse:

Erbt von Oberklasse.
Überschreibt die Methode printInfo(), um eine andere Nachricht auszugeben.
Enthält eine zusätzliche Methode spezielleMethode(), die nur in der Unterklasse verfügbar ist.
Klasse TypumwandlungBeispiel:

Enthält die main()-Methode, die Beispiele für Upcasting und Downcasting zeigt.
------------------------------------------------------------------------------------------------------------------------
Upcasting:
Automatische Typumwandlung: Eine Instanz der Unterklasse wird in eine Variable der Oberklasse konvertiert.
Regeln:
Upcasting ist immer sicher und wird automatisch durchgeführt.
Methoden der Oberklasse können aufgerufen werden. Wenn sie in der Unterklasse überschrieben wurden,
wird die Methode der Unterklasse aufgerufen (Polymorphismus).
------------------------------------------------------------------------------------------------------------------------
Downcasting:
Explizite Typumwandlung: Eine Instanz der Oberklasse wird in eine Variable der Unterklasse konvertiert.
Regeln:
Downcasting muss explizit mit (Unterklasse) durchgeführt werden.
Vor dem Downcasting sollte sicher sein, dass das Objekt tatsächlich eine Instanz der Unterklasse ist.
Andernfalls führt es zu einer ClassCastException.
Zusätzliche Methoden der Unterklasse können nach dem Downcasting aufgerufen werden.
------------------------------------------------------------------------------------------------------------------------
ClassCastException:
Versuch eines ungültigen Downcastings:

Regeln:
Ein ungültiges Downcasting, bei dem das Objekt keine Instanz der Unterklasse ist, führt zu einer ClassCastException.
Es ist ratsam, vor dem Downcasting den Typ mit instanceof zu überprüfen:
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Typumwandlung_UpCasting_DownCasting;

class Oberklasse {
    public void printInfo() {
        System.out.println("Dies ist die Oberklasse.");
    }
}

class Unterklasse extends Oberklasse {
    @Override
    public void printInfo() {
        System.out.println("Dies ist die Unterklasse.");
    }

    public void spezielleMethode() {
        System.out.println("Spezielle Methode der Unterklasse.");
    }
}

public class TypumwandlungBeispiel {
    public static void main(String[] args) {
        // Automatische Typumwandlung (Upcasting)
        Oberklasse obj = new Unterklasse();
        obj.printInfo(); // Ausgabe: Dies ist die Unterklasse.

        // Explizite Typumwandlung (Downcasting)
        Unterklasse sub = (Unterklasse) obj;
        sub.printInfo(); // Ausgabe: Dies ist die Unterklasse.
        sub.spezielleMethode(); // Ausgabe: Spezielle Methode der Unterklasse.

        // Versuch eines ungültigen Downcastings
        Oberklasse obj2 = new Oberklasse();
        try {
            Unterklasse sub2 = (Unterklasse) obj2; // Wird eine ClassCastException auslösen
            sub2.printInfo();
        } catch (ClassCastException e) {
            System.out.println("Ungültiges Downcasting!");
        }
    }
}
