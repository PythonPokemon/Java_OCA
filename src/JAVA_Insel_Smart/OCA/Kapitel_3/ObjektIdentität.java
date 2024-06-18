/*
Die Vergleichsoperatoren == und != sind für alle Datentypen so
definiert, dass sie die vollständige Übereinstimmung zweier Werte
testen. Bei primitiven Datentypen ist das einfach einzusehen und
bei Referenztypen im Prinzip genauso (zur Erinnerung: Referenzen
lassen sich als Pointer verstehen, was Ganzzahlen sind). Der
Operator == testet bei Referenzen, ob sie übereinstimmen, also auf
dasselbe Objekt verweisen, != das Gegenteil, ob sie nicht
übereinstimmen, also die Referenzen ungleich sind. Demnach sagt
der Test etwas über die Identität der referenzierten Objekte aus, aber
nichts darüber, ob zwei verschiedene Objekte möglicherweise den
gleichen Inhalt haben. Der Inhalt der Objekte spielt bei == und !=
keine Rolle.
------------------------------------------------------------------------------------------------------------------------
Da p und q auf dasselbe Objekt verweisen, ergibt der Vergleich true. p
und r referenzieren unterschiedliche Objekte, die aber
zufälligerweise den gleichen Inhalt haben. Doch woher soll der
Compiler wissen, wann zwei Punkt-Objekte inhaltlich gleich sind?
Weil sich ein Punkt durch die Attribute x und y auszeichnet? Die
Laufzeitumgebung könnte voreilig die Belegung jeder
Objektvariablen vergleichen, doch das entspricht nicht immer
einem korrekten Vergleich, so wie wir ihn uns wünschen.
Ein PunktObjekt könnte etwa zusätzlich die Anzahl der Zugriffe zählen, die
jedoch für einen Vergleich, der auf der Lage zweier Punkte basiert,
nicht berücksichtigt werden darf.
------------------------------------------------------------------------------------------------------------------------
== Operator
Der == Operator vergleicht, ob zwei Referenzvariablen auf dasselbe Objekt im Speicher zeigen.
Er prüft die Referenzgleichheit und nicht die Gleichheit der Inhalte der Objekte.
* */
package JAVA_Insel_Smart.OCA.Kapitel_3;
import java.awt.Point;

public class ObjektIdentität {
    public static void main(String[] args) {
        Point p = new Point( 10, 10 );
        Point q = p;

        Point r = new Point( 10, 10 );

        System.out.println( p == q ); // true, da p und q dasselbe Objekt referenzieren
        System.out.println( p == r ); // false, da p und r zwei verschiedene Punkt-
        // Objekte referenzieren, die zufällig dieselben
        // Koordinaten haben
//----------------------------------------------------------------------------------------------------------------------

    }
}
