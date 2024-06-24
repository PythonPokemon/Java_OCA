/*
Erklärung:
Oberklasse Oberklasse:

Enthält eine Methode ausgabe, die eine Nachricht ausgibt.
------------------------------------------------------------------------------------------------------------------------
Unterklasse Unterklasse:

Erbt von Oberklasse.
Überschreibt die Methode ausgabe, um eine andere Nachricht auszugeben.
Das @Override-Annotation wird verwendet, um anzuzeigen, dass die Methode der Oberklasse überschrieben wird.
------------------------------------------------------------------------------------------------------------------------
Hauptklasse MethodenUeberschreibenBeispiel:

Enthält die main()-Methode, die Beispiele für das Aufrufen der Methode ausgabe sowohl auf Objekten der Oberklasse
als auch der Unterklasse zeigt.
------------------------------------------------------------------------------------------------------------------------
Regeln und wichtige Punkte:

Überschreiben von Methoden:

Eine Methode wird überschrieben, indem in der Unterklasse eine Methode mit derselben Signatur
(Name, Parameterliste und Rückgabewert) bereitgestellt wird.
Verwenden Sie die @Override-Annotation, um anzuzeigen, dass eine Methode überschrieben wird.
Dies hilft, Fehler zu vermeiden, indem der Compiler sicherstellt, dass eine Methode tatsächlich überschrieben wird.
------------------------------------------------------------------------------------------------------------------------
Polymorphismus:

Wenn eine Methode auf einem Objekt aufgerufen wird, das durch eine Oberklasse referenziert wird,
aber tatsächlich eine Instanz der Unterklasse ist, wird die Methode der Unterklasse aufgerufen.
Dies ermöglicht es, dass Methodenaufrufe zur Laufzeit auf das spezifische Verhalten der Unterklasse verweisen,
auch wenn der Referenztyp der Oberklasse entspricht.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Methoden_Übershreiben;

class Oberklasse {
    // Methode in der Oberklasse
    void ausgabe() {
        System.out.println("Oberklasse");
    }
}

class Unterklasse extends Oberklasse {

    // Überschreiben die geerbte methode der Oberklasse, bei sich selbst in der Unterklasse, weil sie dieselbe Signatur hat
    @Override
    void ausgabe() {
        System.out.println("Unterklasse");// elemente sind egal
    }
}

public class MethodenUeberschreibenBeispiel {
    public static void main(String[] args) {
        Oberklasse obj1 = new Oberklasse();
        Unterklasse obj2 = new Unterklasse();
        Oberklasse obj3 = new Unterklasse(); // tatsächliche instanz der Unterklasse mit der referenz zur Oberklasse

        // Aufruf der Methode in der Oberklasse
        obj1.ausgabe(); // Ausgabe: Oberklasse |

        // Aufruf der Methode in der Unterklasse
        obj2.ausgabe(); // Ausgabe: Unterklasse

        // Polymorphismus: Methode der Unterklasse wird aufgerufen
        obj3.ausgabe(); // Ausgabe: Unterklasse
    }
}
