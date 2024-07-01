/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Standard-Implementierung von hashCode():
Die Standard-Implementierung der hashCode()-Methode liefert einen eindeutigen Hash-Wert für jedes Objekt,
basierend auf der Speicheradresse des Objekts.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Hashwerte_über_hashCode;

// Standard_Implementierung_von_hashCode ohne es zu überschreiben
public class Standard_Implementierung_von_hashCode {
    private String name;
    private int alter;

    public Standard_Implementierung_von_hashCode(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public static void main(String[] args) {
        Standard_Implementierung_von_hashCode p1 = new Standard_Implementierung_von_hashCode("Max", 25);
        Standard_Implementierung_von_hashCode p2 = new Standard_Implementierung_von_hashCode("Max", 25);

        System.out.println(p1.hashCode());  // Gibt einen Hash-Wert aus
        System.out.println(p2.hashCode());  // Gibt einen anderen Hash-Wert aus
        System.out.println(p1.equals(p2));  // Gibt false aus, da equals nicht überschrieben wurde
    }
}
