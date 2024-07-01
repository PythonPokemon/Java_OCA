/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Überschreiben von equals() und hashCode():

Die Methode equals() wird überschrieben, um die inhaltliche Gleichheit der Auto-Objekte zu überprüfen.
Die Methode hashCode() wird überschrieben, um einen konsistenten Hash-Wert für gleiche Objekte zu liefern.
------------------------------------------------------------------------------------------------------------------------
Verwendung von System.identityHashCode():

System.identityHashCode(a1) und System.identityHashCode(a2) geben den Standard-Hashcode der Objekte a1 und a2 zurück,
basierend auf der Speicheradresse.
------------------------------------------------------------------------------------------------------------------------
Vergleich der Hashcodes und Objekte:

a1.hashCode() und a2.hashCode() geben den Hashcode basierend auf dem kennzeichen zurück.
a1.equals(a2) gibt true zurück, da die Kennzeichen der beiden Auto-Objekte gleich sind.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.System_IdentityHashCode;

// Überschreiben_von_SystemIdentityHashCode

public class Überschreiben_von_SystemIdentityHashCode {
    private String kennzeichen;

    public Überschreiben_von_SystemIdentityHashCode(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Überschreiben_von_SystemIdentityHashCode objInstanz1 = (Überschreiben_von_SystemIdentityHashCode) obj;
        return kennzeichen.equals(objInstanz1.kennzeichen);
    }

    @Override
    public int hashCode() {
        return kennzeichen.hashCode();
    }

    public static void main(String[] args) {
        Überschreiben_von_SystemIdentityHashCode a1 = new Überschreiben_von_SystemIdentityHashCode("B-1234");
        Überschreiben_von_SystemIdentityHashCode a2 = new Überschreiben_von_SystemIdentityHashCode("B-1234");

        // Ausgabe des Standard-Hashcodes
        System.out.println("Standard-Hashcode a1: " + System.identityHashCode(a1));
        System.out.println("Standard-Hashcode a2: " + System.identityHashCode(a2));

        // Ausgabe des überschriebenen Hashcodes
        System.out.println("Überschriebener Hashcode a1: " + a1.hashCode());
        System.out.println("Überschriebener Hashcode a2: " + a2.hashCode());

        // Vergleich der Objekte
        System.out.println("a1 equals a2: " + a1.equals(a2));
    }
}
