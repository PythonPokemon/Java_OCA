/*
                          | Getestet mit    |   Implementierung |
Identität der Referenzen  |     == bzw. !=  |   Nichts zu tun   |
                            Getestet mit    |   Implementierung |
                         |  ------------------------------------|
Gleichheit der Zustände  |  equals(…) bzw.! |   Abhängig von der|
                         |  equals(…)       |   Klasse          |
------------------------------------------------------------------------------------------------------------------------


* */
package JAVA_Insel_Smart.OCA.Kapitel_3;
import java.awt.Point;

public class GleicheObjekte_GleicherInhalt {
    public static void main(String[] args) {
        //Zwei nichtidentische, inhaltlich gleiche Punkt-Objekte, verglichen
        //mit == und equals(…):
        Point p = new Point( 10, 10 );
        Point q = new Point( 10, 10 );

        System.out.println( p == q ); // false
        System.out.println( p.equals(q) ); // true. Da symmetrisch auch q.equals(p)
        //Nur equals(…) testet in diesem Fall die inhaltliche Gleichheit.
    }
}
