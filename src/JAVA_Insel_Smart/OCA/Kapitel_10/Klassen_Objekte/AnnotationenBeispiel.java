/*
Annotationstypen aus java.lang
------------------------------------------------------------------------------------------------------------------------
In der Java-Standardbibliothek gibt es mehrere vordefinierte Annotationstypen, die nützlich sind,
um bestimmte Hinweise und Anweisungen im Code zu geben.
------------------------------------------------------------------------------------------------------------------------
Hier sind die drei wichtigsten:

@Override: Kennzeichnet Methoden, die eine Methode der Superklasse überschreiben.
@Deprecated: Kennzeichnet Elemente, die veraltet und nicht mehr empfohlen sind.
@SuppressWarnings: Unterdrückt Warnmeldungen des Compilers.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte;

// Basisklasse mit einer Methode, die überschrieben wird
class Tier {
    public void lautGeben() {
        System.out.println("Das Tier macht ein Geräusch");
    }
}

// Unterklasse, die die Methode der Basisklasse überschreibt
class Hund extends Tier {
    @Override
    public void lautGeben() {
        System.out.println("Der Hund bellt");
    }

    // Veraltete Methode
    @Deprecated
    public void alteMethode() {
        System.out.println("Diese Methode ist veraltet");
    }
}

public class AnnotationenBeispiel {
    public static void main(String[] args) {
        Hund hund = new Hund();

        // Verwendung der überschriebenen Methode
        hund.lautGeben();

        // Verwendung der veralteten Methode
        hund.alteMethode();

        // Verwendung der Methode mit unterdrückten Warnungen
        unterdrueckeWarnungen();
    }

    @SuppressWarnings("deprecation")
    public static void unterdrueckeWarnungen() {
        Hund hund = new Hund();
        // Unterdrückung der Warnung wegen der Verwendung der veralteten Methode
        hund.alteMethode();
    }
}
