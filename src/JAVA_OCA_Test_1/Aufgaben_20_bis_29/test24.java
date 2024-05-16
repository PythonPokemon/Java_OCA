/*
* Syntax-Besonderheiten:
*
* Interfaces und Abstrakte Klassen:
* Ein Interface wird mit dem Schlüsselwort interface deklariert.
* Eine abstrakte Klasse wird mit dem Schlüsselwort abstract deklariert.
* Eine Klasse, die ein Interface implementiert, muss alle Methoden dieses Interfaces implementieren oder selbst als abstract deklariert werden.
*
* Methodendefinitionen:
* Methoden in Interfaces sind implizit public und abstract.
* Abstrakte Klassen können sowohl abstrakte als auch konkrete Methoden enthalten.
*
* Vererbung und Implementierung:
* Eine Klasse verwendet extends, um von einer anderen Klasse zu erben.
* Eine Klasse verwendet implements, um ein Interface zu implementieren.
*
* Zugriffsmodifikatoren:
* public, protected, private, und default bestimmen die Sichtbarkeit und den Zugriff auf Klassen, Methoden und Felder.
* In Interfaces sind alle Methoden implizit public.
*
* Überschreiben und Implementieren:
* Eine Methode in einer Unterklasse kann eine Methode der Oberklasse überschreiben.
* Das @Override Annotation ist optional, aber empfohlen, um sicherzustellen, dass eine Methode korrekt überschrieben wird.
*
* Zusammenfassung:
* Paper und NewsPaper sind abstrakte Klassen, die das Printable Interface implementieren.
* Paper implementiert nur setMargin(), während NewsPaper sowohl setMargin() als auch setOrientation() implementiert.
* Die main-Methode ist leer und führt keine Aktionen aus.
* Diese Struktur zeigt die Hierarchie und Implementierung von Interfaces und abstrakten Klassen in Java.
* */

package JAVA_OCA_Test_1.Aufgaben_20_bis_29;

public class test24 {
    public static void main(String[] args) {
    }

    interface Printable {
        public void setMargin();
        public void setOrientation();
    }

    abstract class Paper implements Printable {
        public void setMargin() {
        }
    }

    abstract class NewsPaper extends Paper {
        public void setMargin() {
        }
        public void setOrientation() {
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
