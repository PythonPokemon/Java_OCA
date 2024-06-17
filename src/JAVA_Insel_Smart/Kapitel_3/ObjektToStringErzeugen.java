/*
toString()
Die Methode toString() liefert als Ergebnis ein String-Objekt, das
den Zustand des Punktes preisgibt. Sie ist insofern besonders, als es
immer auf jedem Objekt eine toString()-Methode gibt – nicht in
jedem Fall ist die Ausgabe allerdings sinnvoll
------------------------------------------------------------------------------------------------------------------------
Anstatt für die Ausgabe explizit println(obj.toString())
aufzurufen, funktioniert auch ein println(obj). Das liegt daran,
dass die Signatur println(Object) jedes beliebige Objekt als
Argument akzeptiert und auf diesem Objekt automatisch die
toString()-Methode aufruft.
* */
package JAVA_Insel_Smart.Kapitel_3;

public class ObjektToStringErzeugen {
    public static void main(String[] args) {
        java.awt.Point player1 = new java.awt.Point();
        java.awt.Point door1 = new java.awt.Point();

        door1.setLocation(10, 100);
        System.out.println(player1.toString()); // java.awt.Point[x=0,y=0]
        System.out.println(door1); // java.awt.Point[x=10,y=100]
    }
}

