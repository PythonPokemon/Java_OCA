/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Überschreiben von equals():

Die Methode equals() wird überschrieben, um die inhaltliche Gleichheit der Person-Objekte zu überprüfen.
Zuerst wird geprüft, ob die Objekte dieselben Referenzen haben (this == obj).
Dann wird geprüft, ob das angegebene Objekt null ist oder ob es eine andere Klasse ist.
Schließlich werden die Felder name und alter verglichen.
------------------------------------------------------------------------------------------------------------------------
Überschreiben von hashCode():

Die Methode hashCode() wird überschrieben, um einen konsistenten Hash-Wert für gleiche Objekte zu liefern.
Der Hash-Wert wird basierend auf den Feldern name und alter berechnet.
31 wird als Multiplikator verwendet, um die Streuung der Hash-Werte zu verbessern.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Hashwerte_über_hashCode;

// Richtiges Überschreiben: von equals() und hashCode() methoden

public class Überschreiben_von_equals_und_hashCode {
    private String name;
    private int alter;

    public Überschreiben_von_equals_und_hashCode(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // überschreiben der methode durch vergleich der ObjektInstanzen und deren referenz
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Überschreiben_von_equals_und_hashCode objInstanz = (Überschreiben_von_equals_und_hashCode) obj;
        return alter == objInstanz.alter && name.equals(objInstanz.name);
    }

    // Überschreiben des Hashwertes
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + alter;
        return result;
    }

    public static void main(String[] args) {
        Überschreiben_von_equals_und_hashCode p1 = new Überschreiben_von_equals_und_hashCode("Max", 25);
        Überschreiben_von_equals_und_hashCode p2 = new Überschreiben_von_equals_und_hashCode("Max", 25);

        System.out.println(p1.hashCode());  // Gibt denselben Hash-Wert wie p2 aus
        System.out.println(p2.hashCode());  // Gibt denselben Hash-Wert wie p1 aus
        System.out.println(p1.equals(p2));  // Gibt true aus, da equals überschrieben wurde
    }
}
