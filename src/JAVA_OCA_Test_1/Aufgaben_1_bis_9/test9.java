/*
* Was passiert im Code?
* Klasse Point:
* Definiert eine einfache Klasse Point, die zwei Ganzzahlvariablen x und y hat, um die Koordinaten eines Punktes zu speichern.
* Die Methode assign(int x, int y) wird definiert, um die Koordinaten eines Punktes zu aktualisieren.
* Es scheint jedoch ein Fehler in der Implementierung dieser Methode zu geben.
*
* Die Methode toString() wird definiert, um eine Zeichenfolge zu generieren, die die Koordinaten des Punktes repräsentiert.
*
* Klasse test9 (Testszenario):
* Die main-Methode erstellt zwei Point-Objekte, p1 und p2.
* Die Koordinaten von p1 werden direkt auf x = 10 und y = 20 gesetzt.
*
* Die assign-Methode wird auf p2 angewendet, wobei die Koordinaten von p1 übergeben werden.
* Die Koordinaten von p1 und p2 werden dann auf der Konsole ausgegeben.
*
* Was wird ausgegeben?
* p1 hat die Koordinaten (10, 20), da diese direkt zugewiesen wurden.
* In der assign-Methode wird x auf this.x (was 0 ist, da es nicht explizit zugewiesen wurde) und y auf p1.y (also 20) gesetzt.
* Daher wird auf der Konsole Point(10, 20):Point(0, 20) ausgegeben.
* Der Punkt p2 hat die Koordinate x = 0, weil in der assign-Methode ein Fehler ist und this.x fälschlicherweise auf x gesetzt wird, anstatt umgekehrt.
* */

package JAVA_OCA_Test_1.Aufgaben_1_bis_9;

class Point {
    int x;  // Attribut x des aktuellen Objekts
    int y;  // Attribut x des aktuellen Objekts

    // Y übernimmt die werte von X = x.10 y.20
    void assign(int x, int y) {
        // Der lokale Parameter x (links) wird auf den Wert des Attributs x (rechts) des aktuellen Objekts gesetzt.
        // Das bedeutet, dass der Wert des Attributs x des aktuellen Objekts in den lokalen Parameter x kopiert wird.
        // Dies ist normalerweise nicht das gewünschte Verhalten, da es den Parameter überschreibt und keine Änderung am Attribut des Objekts vornimmt.
        x = this.x;     // bei y ist this.x 10 standartwert, wird aber mit dem standartwert überschrieben| 0 da

        // Der lokale Parameter y wird korrekt dem Attribut y des aktuellen Objekts zugewiesen.
        this.y = y;     // bei y ist 20 standartwert, wird spiegelverkehrt überschrieben also bleibt es bei 20, sonst wäre es auch 0
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")"; // gibt jeweils ansicht wieder Point(x10, y20):Point(x0, y20)
    }
}

public class test9 {
    public static void main(String[] args) {
        Point p1 = new Point(); // koordinaten standartwert X = 0 und Y = 0
        p1.x = 10;
        p1.y = 20;
        Point p2 = new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.toString() + ":" + p2.toString());    // Point(10, 20):Point(0, 20)
    }
}
//--------------------------------------------ACHTUNG WICHTIG-----------------------------------------------------------
/*
* Die Methode assign(int x, int y) soll dazu dienen, die Koordinaten eines Point-Objekts zu aktualisieren.
* Hier ist eine Erklärung, was jeder Teil der Methode tut:
*
* Parameterübergabe:
* Die Methode assign hat zwei Parameter int x und int y, die die neuen Koordinaten darstellen sollen,
* die dem Point-Objekt zugewiesen werden sollen.
*
* Aktualisierung von x:
* x = this.x;
* Hier wird versucht, den lokalen Parameter x, der als Argument an die Methode übergeben wurde, auf den Wert von this.x zu setzen.
* this.x bezieht sich auf das x-Attribut des aktuellen Point-Objekts. Dieser Schritt ist jedoch fehlerhaft, da es zu einer falschen Zuweisung führt.
* Es sollte stattdessen umgekehrt sein: this.x = x;, um den Parameter x an das Attribut x des Objekts zuzuweisen.
*
* Aktualisierung von y:
* this.y = y;
* Hier wird das y-Attribut des aktuellen Point-Objekts auf den Wert von y gesetzt, der als Argument an die Methode übergeben wurde.
* Dieser Teil ist korrekt und aktualisiert die y-Koordinate des Point-Objekts ordnungsgemäß.
* Insgesamt sollte die assign-Methode die Koordinaten eines Point-Objekts aktualisieren,
* aber aufgrund des Fehlers in der Zuweisung von x wird der Effekt dieser Methode nicht wie erwartet sein.
* ----------------------------------------------------------------------------------------------------------------------
* --------------------------------------------EXTREM WICHTIG------------------------------------------------------------
* ----------------------------------------------------------------------------------------------------------------------
* Die Reihenfolge der Zuweisung in x = this.x; und this.x = x; macht einen großen Unterschied in der Bedeutung der Anweisung:
*
* x = this.x;
* Hier wird der lokale Parameter x auf den Wert des Attributs x des aktuellen Objekts gesetzt.
* Dies bedeutet, dass der Wert des Attributs x in x kopiert wird. Dies ist normalerweise nicht das gewünschte Verhalten,
* da es den Parameter überschreibt und keine Änderung am Attribut des Objekts vornimmt.
*
* this.x = x;
* Hier wird das Attribut x des aktuellen Objekts auf den Wert des Parameters x gesetzt.
* Dies bedeutet, dass der Wert des Parameters x dem Attribut x des Objekts zugewiesen wird.
* Dies ist normalerweise das gewünschte Verhalten, da es das Attribut des Objekts aktualisiert, basierend auf dem Wert des Parameters.
*
* In der Regel willst du den Wert des Parameters einem Attribut des Objekts zuweisen, nicht andersherum.
* Daher ist this.x = x; in den meisten Fällen die korrekte Zuweisung.
* */