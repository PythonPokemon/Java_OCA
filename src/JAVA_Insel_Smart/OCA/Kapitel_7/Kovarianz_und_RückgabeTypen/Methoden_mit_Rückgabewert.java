package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

public class Methoden_mit_Rückgabewert {

    public static void main(String[] args) {

        // Instanzdummy der klasse 'Methoden_mit_Rückgabewert'
        Methoden_mit_Rückgabewert obj = new Methoden_mit_Rückgabewert();

        // der Variable 'ergebnisBezeichner' mit dem Datentyp int wird das obj/InstanzDummy zugewiesen
        // die, die fähigkeit hat die methode 'add' mit den parametern aufzurufen
        int ergebnisBezeichner = obj.add(5, 3); // Verwenden Sie die add-Methode und speichern Sie das Ergebnis

        // aufruf
        System.out.println(ergebnisBezeichner); // Geben Sie das Ergebnis aus
    }

    // Methode mit Rückgabewert außerhalb der 'main methode'
    // da diese methode 'add' nicht void ist, muss man mit 'return' arbeiten
    public int add(int a, int b) {
        return a + b; // Gibt die Summe von a und b zurück
    }
}
