/*
Tür und Spieler auf dem Spielbrett
Punkt-Objekte erscheinen auf den ersten Blick als mathematische
Konstrukte, doch sie sind allgemein nutzbar. Alles, was eine Position
im zweidimensionalen Raum hat, lässt sich gut durch ein PunktObjekt repräsentieren.
Der Punkt speichert für uns ja x und y, und
hätten wir keine Punkt-Objekte, so müssten wir x und y immer
extra speichern.
Nehmen wir an, wir wollen einen Spieler und eine Tür auf ein
Spielbrett setzen. Natürlich haben die beiden Objekte Positionen.
Ohne Objekte würde eine Speicherung der Koordinaten vielleicht so
------------------------------------------------------------------------------------------------------------------------
Das folgende Beispiel erzeugt zwei Punkte, die die x/y-Koordinate
eines Spielers und einer Tür auf einem Spielbrett repräsentieren.
Nachdem die Punkte erzeugt wurden, werden die Koordinaten
gesetzt, und es wird außerdem getestet, wie weit der Spieler und die
Tür voneinander entfernt sind:
aussehen:
------------------------------------------------------------------------------------------------------------------------
Im ersten Fall belegen wir die Variablen x, y des Spiels explizit. Im
zweiten Fall setzen wir nicht direkt die Objektzustände über die
Variablen, sondern verändern die Zustände über die Methode
setLocation(…). Die beiden Objekte besitzen eigene Koordinaten
und kommen sich nicht in die Quere
* */
package JAVA_Insel_Smart.OCA.Kapitel_3;

public class ObjektErzeugen {
    public static void main(String[] args) {
//        java.awt.Point p;
        java.awt.Point player = new java.awt.Point();
        player.x = player.y = 10;   // der wert 10 wird für x und y koordinate verwendet

        java.awt.Point door = new java.awt.Point();
        door.setLocation(10, 100);
        System.out.println(player.distance(door)); // die methode .distance() ermittelt die different der Koordinaten

//----------------------------------------------------------------------------------------------------------------------
//        p = new java.awt.Point();   // syntax zum Anlegen eines neuen Objektes, die die methode .Point() beinhaltet
//        p.x = 1;
//        p.y = 2;
//        System.out.println(p);  // Es werden Koordinaten mit dem startwert x0 und y0 angelegt: java.awt.Point[x=0,y=0]
//----------------------------------------------------------------------------------------------------------------------
        int playerX;
        int playerY;
        int doorX;
        int doorY;
    }
}
