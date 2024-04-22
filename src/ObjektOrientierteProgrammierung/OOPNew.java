package ObjektOrientierteProgrammierung;/*
* Lernziel:
* - Objekte haben: Eine Identität, einen Zustand, ein Verhalten
* - Objekte mit new erzeugen
* - Konstruktoraufruf
* - Referenzvariablen deklarieren
* - Referenztyp, Objekttyp
* - Mit dem Punkt auf Attribute und Methoden zurückgreifen
* - toString() Abkürzung
- man kann es sich gut merken mit | hat & kann bsp. ich habe ein auto und es kann fahren!
- alle objekte haben grundsätzlich eine klasse von der sie abstammen, dem sog. Bauplan
- ein Objekt it eine Instanz einer Klasse | gemeint ist das es davon abgeleitet wird.
- um ein neues objekt zu bauen braucht man schlüsselwort new!
- Klassen werden im Allgemeinen großgeschrieben!
- Eigenschaften sind Attribute, dass das Objekt speichert
* */

import java.awt.*;

public class OOPNew {
    public static void main(String[] args) {
        // Variante 1 | Objekt Identität p
        System.out.println(new java.awt.Point());   // MIt X,Y, Koordinaten
        java.awt.Point p = new java.awt.Point();

        //variante 2 | Objekt Identität q | Objekt zustand x und y
        java.awt.Point q; // deklaration X,Y, Koordinaten zu q
        q = new java.awt.Point(); // initialisierung q

        p.x = 10;
        p.y = 15;
        System.out.println(p.x);
        System.out.println(p.y);

        // Methodenvariante
        p.setLocation(11, 22 );
        System.out.println(p.toString()); // p wurden werte zugewiesen deswegen wird x=11, y=22 angezeigt
        System.out.println(q.toString()); // q wurden keine werte zugewiesen deswegen wird x=0, y=0 angezeigt
        // Alternativ ausdruck
        System.out.println(p);
        System.out.println(q);

        String s = p.toString();
        System.out.println(s.length()); // zeigt die länge der zeichenkette an von | p.toString = java.awt.Point[x=11,y=22] = 25
    }
}
