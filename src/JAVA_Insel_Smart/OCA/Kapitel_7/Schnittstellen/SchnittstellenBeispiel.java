/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Definition der Schnittstelle:

Schnittstelle deklariert eine Methode methode() ohne Implementierung.
------------------------------------------------------------------------------------------------------------------------
2.Implementierung der Schnittstelle:

Implementierung ist eine Klasse, die die Schnittstelle Schnittstelle implementiert.
Die Klasse Implementierung muss die Methode methode() definieren, um die Schnittstelle zu implementieren.
------------------------------------------------------------------------------------------------------------------------
3.Instanziierung und Methodenaufruf:

Eine Instanz der Klasse Implementierung wird erstellt.
Die Methode methode() wird aufgerufen, was die Implementierung in der Klasse Implementierung ausführt.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der Schnittstelle | auch in derselben datei möglich!
interface Schnittstelle1 {
    void methode();
}


// Eine Klasse kann mehrere Schnittstellen implementieren. Dies wird durch Kommas getrennt angegeben.
// Klasse, die die Schnittstelle implementiert
class Implementierung implements Schnittstelle1 {

    @Override
    public void methode() {
        System.out.println("Implementierung der Methode, aus der 'Schnittstelle1' in Implementierung");
    }

}

public class SchnittstellenBeispiel {

    public static void main(String[] args) {
        Implementierung obj = new Implementierung();
        obj.methode();  // Aufruf der implementierten Methode

    }
}
