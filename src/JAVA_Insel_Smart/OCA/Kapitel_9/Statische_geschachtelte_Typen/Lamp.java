/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Statische geschachtelte Klasse:

Die Klasse Bulb ist eine statische geschachtelte Klasse innerhalb der äußeren Klasse Lamp.
Statische geschachtelte Klassen können wie „normale“ Klassen verwendet werden,
aber sie befinden sich im Namensraum der äußeren Klasse.
------------------------------------------------------------------------------------------------------------------------
2.Zugriff auf statische Mitglieder:

Statische geschachtelte Klassen können auf statische Mitglieder der äußeren Klasse zugreifen.
In diesem Fall kann die Methode output auf das statische Feld name der Klasse Lamp zugreifen.
------------------------------------------------------------------------------------------------------------------------
3.Einschränkungen:

Statische geschachtelte Klassen können nicht direkt auf nichtstatische Mitglieder der äußeren Klasse zugreifen.
Der Versuch, auf das nichtstatische Feld watt zuzugreifen, würde zu einem Kompilierungsfehler führen.
------------------------------------------------------------------------------------------------------------------------
4.Erzeugung von Instanzen:

Zur Erzeugung von Instanzen statischer geschachtelter Klassen ist keine Instanz der äußeren Klasse erforderlich.
Eine Instanz der statischen geschachtelten Klasse Bulb kann direkt durch new Lamp.Bulb() erzeugt werden.
------------------------------------------------------------------------------------------------------------------------
Namensraum und Syntax:

Der Syntax Lamp.Bulb zeigt lediglich an, dass die Klasse Bulb eine geschachtelte Klasse der äußeren Klasse Lamp ist.
Dies bedeutet jedoch nicht, dass eine Instanz von Lamp erforderlich ist, um eine Instanz von Bulb zu erstellen.

new Lamp.Bulb() ist die korrekte Syntax, um eine Instanz der statischen geschachtelten Klasse Bulb zu erstellen.
Dies zeigt lediglich die Beziehung im Namensraum zwischen Lamp und Bulb.
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_9.Statische_geschachtelte_Typen;

// äußere Klasse
public class Lamp {
    static String name = "Latifa";
    int watt = 1985;

    // innere Klasse | Geschachtelt
    static class Bulb {
        void output() {
            System.out.println(name); // kann das Attribut ausgeben, weil es ein stattisches feld ist
            // System.out.println(watt); // kann keine referenz zu einem nicht statischem feld bieten
        }
    }

    public static void main(String[] args) {
        Bulb objektInstanz = new Lamp.Bulb();  // erstellung einer 'objektInstanz' für die Klasse 'Bulb' mit Ref. zu Lamp
        objektInstanz.output(); // 'objektInstanz' ruft die methode '.output()' aus der Klasse 'Bulb'
                                // die wiederum die methode 'Sout()' mit dem Argument 'name' das ein statisches Attribut
                                // Feld mit dem String 'Latifa' in der äußeren Klasse 'Lamp' ist
    }
}
