/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Definition des Enums Planet:

Das Enum Planet definiert vier Konstanten: MERKUR, VENUS, ERDE und MARS.
Jede Konstante wird mit zwei Argumenten initialisiert: masse und radius.
------------------------------------------------------------------------------------------------------------------------
2.Konstruktor des Enums:

Der Konstruktor Planet(double masse, double radius) wird verwendet,
um die Felder masse und radius für jede Konstante zu initialisieren.
Die Felder masse und radius sind final, da sie nach der Initialisierung nicht mehr geändert werden sollen.
------------------------------------------------------------------------------------------------------------------------
3.Getter-Methoden:

getMasse() und getRadius() sind Methoden, die die Masse und den Radius eines Planeten zurückgeben.
------------------------------------------------------------------------------------------------------------------------
4.Verwendung des Enums in der main-Methode:

Die main-Methode iteriert über alle Werte des Enums mit Planet.values().
Für jeden Planeten werden der Name, die Masse und der Radius ausgegeben.
------------------------------------------------------------------------------------------------------------------------
----------------------------Regeln für die Verwendung von Enums mit eigenen Konstruktoren-------------------------------
------------------------------------------------------------------------------------------------------------------------
1.Definiere Felder für zusätzliche Daten:

Verwende Felder in deinem Enum, um zusätzliche Daten für jede Konstante zu speichern.
Diese Felder sollten final sein, um sicherzustellen, dass sie nach der Initialisierung nicht mehr geändert werden.
------------------------------------------------------------------------------------------------------------------------
2.Erstelle einen Konstruktor:
Definiere einen Konstruktor, um die Felder zu initialisieren.
Der Konstruktor sollte private oder package-private sein, da Enums keine öffentlichen Konstruktoren haben können.
------------------------------------------------------------------------------------------------------------------------
3.Verwende Getter-Methoden:
Erstelle Getter-Methoden, um auf die Felder zuzugreifen.
Dies ermöglicht eine klare und sichere Möglichkeit, die Daten zu lesen.
------------------------------------------------------------------------------------------------------------------------
4.Iteriere über die Enum-Werte:
Verwende die Methode values(), um über alle Werte des Enums zu iterieren.
Dies ist nützlich, um alle Konstanten eines Enums zu durchlaufen und deren Daten zu verarbeiten.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Enums;

// Konstanten werden groß geschrieben, siehe im 'ENUM'
 enum Planet {
    MERKUR(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    ERDE(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    private final double masse;  // in Kilogramm
    private final double radius;  // in Metern

    // Konstruktor
    Planet(double masse, double radius) {
        this.masse = masse;
        this.radius = radius;
    }

    // Getter-Methode für die Masse
    public double getMasse() {
        return masse;
    }

    // Getter-Methode für den Radius
    public double getRadius() {
        return radius;
    }
}

public class EnumMitKonstruktor {
    public static void main(String[] args) {
        // Verwenden des Enums und Zugriff auf die Felder und Methoden
        for (Planet planet : Planet.values()) {
            System.out.println("Planet: " + planet);
            System.out.println("Masse: " + planet.getMasse() + " kg");
            System.out.println("Radius: " + planet.getRadius() + " m");
            System.out.println();
        }
    }
}
