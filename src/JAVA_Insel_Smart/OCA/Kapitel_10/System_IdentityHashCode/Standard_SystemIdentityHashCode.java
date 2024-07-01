/*
Erklärung
Auto-Klasse:
Die Klasse Auto hat ein Attribut kennzeichen, das das Kennzeichen des Autos repräsentiert.
Standard-Hashcode mit System.identityHashCode():
System.identityHashCode(a1) gibt den Standard-Hashcode des Objekts a1 zurück, unabhängig davon,
ob hashCode() überschrieben wurde.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.System_IdentityHashCode;

// Standard_SystemIdentityHashCode

public class Standard_SystemIdentityHashCode {
    private String kennzeichen;

    public Standard_SystemIdentityHashCode(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public static void main(String[] args) {
        Standard_SystemIdentityHashCode a1 = new Standard_SystemIdentityHashCode("B-1234");
        Standard_SystemIdentityHashCode a2 = new Standard_SystemIdentityHashCode("B-1234");

        // Ausgabe des Standard-Hashcodes
        System.out.println(System.identityHashCode(a1));  // Gibt den Standard-Hashcode für a1 aus
        System.out.println(System.identityHashCode(a2));  // Gibt den Standard-Hashcode für a2 aus

        // Vergleich mit dem Standard-Hashcode
        System.out.println(a1.hashCode());  // Kann unterschiedlich sein, wenn hashCode() überschrieben wurde
    }
}
