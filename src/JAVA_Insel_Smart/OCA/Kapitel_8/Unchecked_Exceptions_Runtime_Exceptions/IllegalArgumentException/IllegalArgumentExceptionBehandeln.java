/*
Erklärung
Die Methode setzeAlter wird innerhalb eines try-catch-Blocks aufgerufen.
Wenn eine IllegalArgumentException ausgelöst wird, wird sie im catch-Block abgefangen.
Die Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.IllegalArgumentException;

public class IllegalArgumentExceptionBehandeln {

    public static void main(String[] args) {

        try {
            setzeAlter(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

    }

    public static void setzeAlter(int alter) {

        if (alter < 0) {
            throw new IllegalArgumentException("Alter darf nicht negativ sein.");
        }
        System.out.println("Das Alter ist: " + alter);

    }
}
