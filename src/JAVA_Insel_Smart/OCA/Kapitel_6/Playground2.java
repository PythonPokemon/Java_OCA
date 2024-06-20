/*
Erklärung der Änderungen:
Hinzufügen der Getter-Methoden:
getName(): Gibt den Namen des Spielers zurück.
getItem(): Gibt den Gegenstand des Spielers zurück.
getSchadensZahl(): Gibt die Schadenszahl des Spielers zurück.
* */
package JAVA_Insel_Smart.OCA.Kapitel_6;

class Player2 {
    private String name1; // Private Attribute
    private String item1; // Private Attribute
    private int dmg1; // Private Attribute

    // Methode, um den Namen zu setzen
    public void setNamen1(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name1 = name;
        } else {
            System.out.println("Ungültiger Name!");
        }
    }

    // Methode, um den Gegenstand zu setzen
    public void setGegenstand1(String item) {
        if (item != null && !item.trim().isEmpty()) {
            this.item1 = item;
        } else {
            System.out.println("Ungültiger Gegenstand!");
        }
    }

    // Methode, um die Schadenszahl zu setzen
    public void setSchadensZahl1(int dmg) {
        if (dmg > 0) {
            this.dmg1 = dmg;
        } else {
            System.out.println("Ungültige Schadenszahl!");
        }
    }

    // Getter-Methode für den Namen
    public String getName1() {
        return name1;
    }

    // Getter-Methode für den Gegenstand
    public String getItem1() {
        return item1;
    }

    // Getter-Methode für die Schadenszahl
    public int getSchadensZahl() {
        return dmg1;
    }

    // Methode, um die Attribute anzuzeigen
    public void display() {
        System.out.println("Spieler Name: " + name1);
        System.out.println("Spieler Gegenstand: " + item1);
        System.out.println("Spieler macht " + dmg1 + " Schaden!");
    }
}

public class Playground2 {
    public static void main(String[] args) {
        Player2 objektBezeichner2 = new Player2(); // Erstellen eines neuen Objekts (Instanz) der Klasse Player

        // Setzen der Attribute über Methoden
        objektBezeichner2.setNamen1("Gandalf der Graue");
        objektBezeichner2.setGegenstand1("Kometen Stab");
        objektBezeichner2.setSchadensZahl1(100);

        // Ausgabe der Attribute
        System.out.println("Spieler Name: " + objektBezeichner2.getName1());
        System.out.println("Spieler Gegenstand: " + objektBezeichner2.getItem1());
        System.out.println("Spieler macht " + objektBezeichner2.getSchadensZahl() + " Schaden!");

        // Aufruf der display()-Methode
        objektBezeichner2.display();
    }
}
