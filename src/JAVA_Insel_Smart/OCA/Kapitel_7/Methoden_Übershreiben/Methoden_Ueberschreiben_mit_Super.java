/*
Erklärung:
1.Oberklasse Oberklasse:

Enthält eine Methode ausgabe(), die die Nachricht "Oberklasse" ausgibt.
------------------------------------------------------------------------------------------------------------------------
2.Unterklasse Unterklasse:

Erbt von Oberklasse.
Überschreibt die Methode ausgabe().
Verwendet super.ausgabe(), um die Methode ausgabe() der Oberklasse aufzurufen.
Gibt danach die Nachricht "Unterklasse" aus.
------------------------------------------------------------------------------------------------------------------------
3.Hauptklasse MethodenUeberschreibenMitSuper:

Enthält die main()-Methode, die Beispiele für das Aufrufen der Methode ausgabe()
sowohl auf Objekten der Oberklasse als auch der Unterklasse zeigt.
------------------------------------------------------------------------------------------------------------------------
Wichtige Punkte und Regeln:

1.Überschreiben von Methoden:

Eine Methode wird überschrieben, indem in der Unterklasse eine Methode mit derselben Signatur
(Name, Parameterliste und Rückgabewert) bereitgestellt wird.
------------------------------------------------------------------------------------------------------------------------
2.Verwendung von super:

super.ausgabe() ruft die Methode ausgabe() der Oberklasse innerhalb der überschreibenden Methode in der Unterklasse auf.
Dies ermöglicht es, das Verhalten der Oberklasse beizubehalten und zusätzlich das Verhalten der Unterklasse hinzuzufügen.
------------------------------------------------------------------------------------------------------------------------
3.Polymorphismus:

Wenn eine Methode auf einem Objekt aufgerufen wird, das durch eine Oberklasse referenziert wird,
aber tatsächlich eine Instanz der Unterklasse ist, wird die Methode der Unterklasse aufgerufen.
Die Methode der Oberklasse wird aufgerufen,
wenn sie explizit mit super in der überschreibenden Methode der Unterklasse aufgerufen wird.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung:
Methodenüberschreibung: Eine Methode in der Unterklasse überschreibt eine Methode in der Oberklasse,
wenn sie dieselbe Signatur hat. Der Inhalt der Methode kann unterschiedlich sein.

Verwendung von super: Das Schlüsselwort super wird verwendet,
um die Methode der Oberklasse innerhalb der überschreibenden Methode in der Unterklasse aufzurufen.

Polymorphismus: Wenn ein Objekt der Unterklasse durch eine Referenz der Oberklasse referenziert wird,
wird die Methode der Unterklasse aufgerufen, wenn sie überschrieben wurde.

Mit diesem Beispiel und den Erklärungen sollte das Konzept des Methodenüberschreibens
und der Verwendung von super zum Aufrufen der Methoden der Oberklasse in der Unterklasse klarer werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Methoden_Übershreiben;
// Methoden_Ueberschreiben_mit_Super
class Oberklasse1 {
    // Methode in der Oberklasse
    void ausgabe() {
        System.out.println("Oberklasse");
    }
}

class Unterklasse1 extends Oberklasse1 {

    // Überschreiben der Methode in der Unterklasse
    @Override
    void ausgabe() {

        // Aufruf der Methode der Oberklasse
        super.ausgabe(); // ruft die methode der Oberklasse auf
        // Zusätzlicher Code in der Unterklasse
        System.out.println("Unterklasse");
    }
}

public class Methoden_Ueberschreiben_mit_Super {
    public static void main(String[] args) {
        Oberklasse1 obj1 = new Oberklasse1();

        Unterklasse1 obj2 = new Unterklasse1();

        Oberklasse1 obj3 = new Unterklasse1();

        // Aufruf der Methode in der Oberklasse
        obj1.ausgabe(); // Ausgabe: Oberklasse

        // Aufruf der überschriebenen Methode in der Unterklasse
        obj2.ausgabe(); // Ausgabe: Oberklasse \n Unterklasse

        // Polymorphismus: Methode der Unterklasse wird aufgerufen
        obj3.ausgabe(); // Ausgabe: Oberklasse \n Unterklasse
    }
}
