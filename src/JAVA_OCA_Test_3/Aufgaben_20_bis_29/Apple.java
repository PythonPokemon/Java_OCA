/*
Welche Option für die Klasse Apple, wenn sie *INSERT* ersetzt, druckt GRÜN auf die Konsole?

Richtige Antwort
this.color = color;

this.color = GREEN;

color = GREEN;

color = color;

Gesamterklärung
Die Farbe der Instanzvariablen wird durch die Parametervariablenfarbe des parametrisierten Konstruktors geschattet.
Farbe = Farbe hat also keine Auswirkungen, da die Kurzschreibweise im Konstruktorkörper immer auf die LOCAL-Variable verweist.
Um auf die Instanzvariable zu verweisen, wird diese Referenz benötigt. Daher ist 'this.color = color;' korrekt.

'color = GREEN;' und 'this.color = GREEN;' verursachen einen Kompilierungsfehler, da GREEN nicht in doppelten Anführungszeichen ("") steht.

HINWEIS: 'color = "GREEN";' weist nur 'GREEN' der lokalen Variablen und nicht der Instanzvariablen zu,
aber 'this.color = "GREEN";' weist der Instanzvariablen 'GREEN' zu.
* */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class Apple {
    public String color;

    public Apple(String color) {
        /*INSERT*/
        this.color = color;
    }

    public static void main(String [] args) {
        Apple apple = new Apple("GREEN");
        System.out.println(apple.color);
    }
}