/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Klasse Raum:
Diese Klasse repräsentiert einen Raum mit einem Attribut flaeche, das die Fläche des Raums speichert.
------------------------------------------------------------------------------------------------------------------------
2.Konstruktor und Getter:
Der Konstruktor initialisiert die Fläche des Raums, und der Getter liefert die Fläche des Raums zurück.
------------------------------------------------------------------------------------------------------------------------
3.Klasse RaumComparator:
Diese Klasse implementiert das Comparator-Interface und überschreibt die compare-Methode,
um zwei Raum-Objekte basierend auf ihrer Fläche zu vergleichen.
------------------------------------------------------------------------------------------------------------------------
4.KleinsterRaumFinden:
In der main-Methode wird eine Liste von Raum-Objekten erstellt und mit Räumen verschiedener Flächen gefüllt.
------------------------------------------------------------------------------------------------------------------------
5.Finden des kleinsten Raums:
Die Methode Collections.min wird verwendet, um den Raum mit der kleinsten Fläche in der Liste zu finden.
Dazu wird der RaumComparator verwendet.
------------------------------------------------------------------------------------------------------------------------
Ausgabe: Die Fläche des kleinsten Raums wird ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Dieser Code zeigt, wie man einen Comparator in Java verwendet, um das kleinste Element in einer Sammlung zu finden.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Raum {
    private int flaeche;

    public Raum(int flaeche) {
        this.flaeche = flaeche;
    }

    public int getFlaeche() {
        return flaeche;
    }
}

class RaumComparator implements Comparator<Raum> {
    @Override
    public int compare(Raum r1, Raum r2) {
        return Integer.compare(r1.getFlaeche(), r2.getFlaeche());
    }
}

public class KleinsterRaumFinden {
    public static void main(String[] args) {
        List<Raum> raeume = new ArrayList<>();
        raeume.add(new Raum(20));
        raeume.add(new Raum(10));
        raeume.add(new Raum(30));

        // Finden des kleinsten Raums
        Raum kleinsterRaum = Collections.min(raeume, new RaumComparator());
        System.out.println("Der kleinste Raum hat eine Fläche von: " + kleinsterRaum.getFlaeche() + " Quadratmetern.");
    }
}
