/*
Hier ist ein einfaches Beispiel, das zeigt, wie der instanceof-Operator verwendet wird, um zu überprüfen,
ob ein Objekt eine Instanz einer bestimmten Klasse oder einer ihrer Unterklassen ist.
------------------------------------------------------------------------------------------------------------------------
Erklärung:
Klasse Oberklasse:

Enthält eine Methode printInfo(), die eine Nachricht ausgibt.
Klasse Unterklasse:

Erbt von Oberklasse.
Überschreibt die Methode printInfo(), um eine andere Nachricht auszugeben.
Enthält eine zusätzliche Methode spezielleMethode(), die nur in der Unterklasse verfügbar ist.
Klasse InstanceofBeispiel:

Enthält die main()-Methode, die zeigt, wie der instanceof-Operator verwendet wird, um die Typen von Objekten zu überprüfen.
------------------------------------------------------------------------------------------------------------------------
Regeln:
Der instanceof-Operator überprüft, ob obj eine Instanz von Unterklasse oder einer ihrer Unterklassen ist.
Wenn die Überprüfung erfolgreich ist (true), kann das Objekt sicher in den Typ Unterklasse umgewandelt werden.
Dies ermöglicht den Zugriff auf Methoden und Attribute, die nur in der Unterklasse definiert sind.
------------------------------------------------------------------------------------------------------------------------
Regeln:
Der instanceof-Operator überprüft, ob obj2 eine Instanz von Unterklasse ist.
Da obj2 eine Instanz von Oberklasse ist, schlägt die Überprüfung fehl und der else-Zweig wird ausgeführt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.InstanceOf;

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

public class InstanceofBeispiel {
    public static void main(String[] args) {
        Oberklasse obj = new Unterklasse();

        // Verwendung des instanceof-Operators zur Typprüfung
        if (obj instanceof Unterklasse) {
            Unterklasse sub = (Unterklasse) obj;
            sub.printInfo();          // Ausgabe: Dies ist die Unterklasse.
            sub.spezielleMethode();   // Ausgabe: Spezielle Methode der Unterklasse.
        } else {
            System.out.println("obj ist keine Instanz von Unterklasse");
        }

        // Beispiel mit einer Instanz der Oberklasse
        Oberklasse obj2 = new Oberklasse();

        if (obj2 instanceof Unterklasse) {
            Unterklasse sub2 = (Unterklasse) obj2;
            sub2.printInfo();
        } else {
            System.out.println("obj2 ist keine Instanz von Unterklasse");
        }
    }
}
