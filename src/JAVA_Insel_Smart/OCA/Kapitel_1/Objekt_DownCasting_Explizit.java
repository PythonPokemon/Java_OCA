/*
Downcasting (explizit):
------------------------------------------------------------------------------------------------------------------------
Das Zuweisen eines Objekts der Oberklasse (Elternklasse) zu einer Referenz
der Unterklasse (KindKlasse) erfordert ein explizites Casting.
Dies ist nur sicher, wenn das tatsächliche Objekt, auf das verwiesen wird, auch eine Instanz der Unterklasse ist.
* */
package JAVA_Insel_Smart.OCA.Kapitel_1;

class Elternklasse {
}

class KindKlasse extends Elternklasse {
}


public class Objekt_DownCasting_Explizit {
    public static void main(String[] args) {
        Elternklasse eltern = new KindKlasse();  // Erstellen eines KindKlasse-Objekts und Upcasting auf Elternklasse

        // Umwandlung des fundamentalen Typs, zu der die Referenz zeigt
        KindKlasse kind = (KindKlasse) eltern;   // Explizites Downcasting:
                                                 // Elternklasse-Referenz wird in KindKlasse-Referenz umgewandelt

        /*
        * das bedeutet, dass die referenz variable die zu dem objekt zeigt jetzt jeweils zur Elternklasse
        * und zur kind klasse referenziert ist:
        * */
        System.out.println(eltern);
        System.out.println(kind);
        System.out.println(eltern == kind);
        System.out.println("kind referenziert ein Objekt vom Typ: " + kind.getClass().getSimpleName());

    }
}
