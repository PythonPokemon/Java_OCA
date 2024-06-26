/*
4. Anonyme innere Klasse
Eine anonyme innere Klasse ist eine Klasse ohne Namen, die an einer Stelle deklariert und instanziiert wird.
Sie wird häufig verwendet, um Schnittstellen oder abstrakte Klassen zu implementieren.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Eine anonyme innere Klasse implementiert die Runnable-Schnittstelle und überschreibt die run-Methode.
Die anonyme innere Klasse hat keinen Namen und wird direkt an der Stelle der Instanziierung definiert.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Nicht_Statisch_geschachtelt;

public class Anonyme_innere_Klasse {
    void createRunnable() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Anonyme innere Klasse");
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Anonyme_innere_Klasse objInstanzDummy = new Anonyme_innere_Klasse();
        objInstanzDummy.createRunnable();
    }
}
