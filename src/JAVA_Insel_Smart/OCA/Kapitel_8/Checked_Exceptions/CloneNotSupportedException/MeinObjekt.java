/*
Erklärung
Implementierung des Cloneable-Interface:

Die Klasse MeinObjekt implementiert das Cloneable-Interface. Dadurch wird signalisiert,
dass die Methode clone() auf Objekte dieser Klasse aufgerufen werden kann.
Die Methode clone() wird überschrieben und ruft super.clone() auf, um eine Kopie des Objekts zu erstellen.
Im try-catch-Block wird das Objekt geklont. Bei Erfolg wird der Wert des geklonten Objekts ausgegeben,
bei Fehlern eine Fehlermeldung.
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

class MeinObjekt implements Cloneable {
    int wert;

    MeinObjekt(int wert) {
        this.wert = wert;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        MeinObjekt obj1 = new MeinObjekt(42);
        try {
            MeinObjekt obj2 = (MeinObjekt) obj1.clone();
            System.out.println("Klon erfolgreich: " + obj2.wert);
        } catch (CloneNotSupportedException e) {
            System.out.println("Fehler: Klonen wird nicht unterstützt.");
        }
    }
}
