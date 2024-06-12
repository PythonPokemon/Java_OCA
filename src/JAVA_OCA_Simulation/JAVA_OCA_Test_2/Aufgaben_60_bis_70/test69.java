/*

Der Code führt zu der Ausgabe "Inner Peace!",
weil die toString()-Methode in der Child-Klasse die toString()-Methode der Parent-Klasse überschreibt und erweitert.

Detaillierte Erklärung:
------------------------------------------------------------------------------------------------------------------------
Class Parent:
Die Parent-Klasse definiert eine toString()-Methode, die den String "Inner " zurückgibt.
Diese Methode wird aufgerufen, wenn eine Instanz der Parent-Klasse in einem Kontext verwendet wird,
der eine String-Darstellung erfordert (z.B. System.out.println()).
------------------------------------------------------------------------------------------------------------------------
Class Child:
Die Child-Klasse erweitert die Parent-Klasse und überschreibt die toString()-Methode.
In der toString()-Methode der Child-Klasse wird die toString()-Methode der
Elternklasse (Parent) mit super.toString() aufgerufen.
Der zurückgegebene String "Inner " wird dann mit "Peace!" verkettet, indem die concat-Methode von String aufgerufen wird.
Das Ergebnis ist der String "Inner Peace!".
------------------------------------------------------------------------------------------------------------------------
Class test69 (Main Methode):
In der main-Methode wird eine neue Instanz der Child-Klasse erstellt.
Da System.out.println(Object x) die toString()-Methode des übergebenen Objekts aufruft,
wird Child's toString()-Methode aufgerufen.
Diese toString()-Methode gibt "Inner Peace!" zurück, was dann von System.out.println() ausgegeben wird.
------------------------------------------------------------------------------------------------------------------------
Ablauf der Methodenaufrufe:
Instanziierung:

new Child() erstellt ein neues Child-Objekt.
toString() Methode:

System.out.println(new Child()) ruft Child's toString()-Methode auf.
super.toString():

Innerhalb der Child's toString()-Methode wird super.toString() aufgerufen, was Parent's toString()-Methode aufruft.
Konkatenation:

Parent's toString() gibt "Inner " zurück.
super.toString().concat("Peace!") fügt "Peace!" an den zurückgegebenen String an.
Ergebnis:

Die resultierende Zeichenkette "Inner Peace!" wird von der toString()-Methode der Child-Klasse zurückgegeben
und von System.out.println() ausgegeben.
Zusammenfassend führt die Verwendung von super.toString() und der concat-Methode zu der Ausgabe "Inner Peace!" im Terminal.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_60_bis_70;

class Parent {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }   // .concat() Methode verkettet strings
}

public class test69 {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}
