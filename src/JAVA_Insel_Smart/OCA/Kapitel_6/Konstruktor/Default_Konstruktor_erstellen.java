package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor;


public class Default_Konstruktor_erstellen {
    String name; // ersetze zum testen: String name = " lustiger name";
    int punkte; // ersetze zum testen: int punkte = 1234;

    // Unsichtbarer Konstruktror jeder Klasse mit Parametern
//    Default_Konstruktor_erstellen(String name, int punkte){
//        this.name = name;
//        this.punkte = punkte;
//    }

    // Methode zur ausgabe der Elemente, Attribute
    void ausgabeFenster(){
        System.out.println("Name: " + name + " punkte: " + punkte); // aufruf der Attribute
    }
    // Ausgabe; Name: null punkte: 0 | weil die werte nicht initialisiert wurden
    // Fazit: Der unsichtbare Default Konstruktror vergibt stellvertretend für String werte: 'null' und int werte '0'

    public static void main(String[] args) {

        // erstellen der objektInstanz für die Klasse 'Default_Konstruktor_erstellen'
        Default_Konstruktor_erstellen objektInstanz = new Default_Konstruktor_erstellen();

        // damit man mit der 'objektInstanz' die methode 'ausgabeFenster' aufrufen kann
        objektInstanz.ausgabeFenster();
    }
}
