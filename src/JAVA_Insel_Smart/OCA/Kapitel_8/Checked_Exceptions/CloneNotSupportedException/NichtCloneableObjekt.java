/*
Erklärung
Klasse ohne Implementierung von Cloneable:

Die Klasse NichtCloneableObjekt implementiert das Cloneable-Interface nicht.
Der Versuch, die Methode clone() aufzurufen, führt zu einer CloneNotSupportedException,
die im catch-Block abgefangen wird und eine Fehlermeldung ausgibt.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices

1.Implementierung des Cloneable-Interface:

Eine Klasse sollte das Cloneable-Interface implementieren, wenn Objekte dieser Klasse geklont werden sollen.
Die Methode clone() sollte in der Klasse überschrieben werden, um super.clone() aufzurufen.
------------------------------------------------------------------------------------------------------------------------
2.Ausnahmebehandlung:

Verwenden Sie try-catch-Blöcke, um die CloneNotSupportedException abzufangen und zu behandeln.
Geben Sie aussagekräftige Fehlermeldungen aus, um das Debuggen zu erleichtern.
------------------------------------------------------------------------------------------------------------------------
3.Sichtbarkeit der Methode clone():

Die Methode clone() sollte protected oder public sein, um vom externen Code aufgerufen werden zu können.
------------------------------------------------------------------------------------------------------------------------
Fazit
Die CloneNotSupportedException ist eine wichtige Ausnahme, die behandelt werden muss,
wenn die clone()-Methode aufgerufen wird. Durch die Implementierung des Cloneable-Interface
und die Verwendung von try-catch-Blöcken können Sie sicherstellen, dass Ihr Programm robust und fehlerresistent bleibt.
Das Bereitstellen klarer und informativer Fehlermeldungen hilft dabei,
Probleme schneller zu identifizieren und zu beheben.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.CloneNotSupportedException;

class NichtCloneableObjekt {
    int wert;

    NichtCloneableObjekt(int wert) {
        this.wert = wert;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        NichtCloneableObjekt obj1 = new NichtCloneableObjekt(42);
        try {
            NichtCloneableObjekt obj2 = (NichtCloneableObjekt) obj1.clone();
            System.out.println("Klon erfolgreich: " + obj2.wert);
        } catch (CloneNotSupportedException e) {
            System.out.println("Fehler: Klonen wird nicht unterstützt.");
        }
    }
}
