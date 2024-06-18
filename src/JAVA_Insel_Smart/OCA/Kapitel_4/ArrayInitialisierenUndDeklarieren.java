/*
Jedes Array beinhaltet Werte nur eines bestimmten Datentyps bzw. Grundtyps.
Dies können sein:

elementare Datentypen wie: int, byte, long usw.
Referenztypen
Referenztypen anderer Arrays, um mehrdimensionale Arrays zu realisieren

4.1.1 Grundbestandteile
Für das Arbeiten mit Arrays müssen wir drei neue Dinge kennenlernen:

das Deklarieren von Array-Variablen
das Initialisieren von Array-Variablen, Platzbeschaffung
den Zugriff auf Arrays, den lesenden Zugriff ebenso wie den schreibenden
* */

package JAVA_Insel_Smart.OCA.Kapitel_4;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;

// Arrays sind Objekte
public class ArrayInitialisierenUndDeklarieren {
    public static void main(String[] args) {
        //Deklariere eine Variable randoms, die ein Array referenziert
        double[] randoms;

        //Initialisiere die Variable mit einem Array-Objekt der Größe 10:
        randoms = new double[10];

        //Belege das erste Element mit einer Zufallszahl und das zweite Element mit dem Doppelten des ersten Elements:
        randoms[0] = Math.random();
        randoms[1] = randoms[0] * 2;

        System.out.println(randoms);

    }
}
