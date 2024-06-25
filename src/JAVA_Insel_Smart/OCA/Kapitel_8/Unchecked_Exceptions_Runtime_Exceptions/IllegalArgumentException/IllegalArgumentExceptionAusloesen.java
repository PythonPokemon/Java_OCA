/*
Die IllegalArgumentException wird ausgelöst, wenn eine Methode einen ungültigen Parameter erhält.
Dies passiert typischerweise, wenn ein Parameter außerhalb des erwarteten Bereichs liegt
oder nicht dem erwarteten Typ entspricht.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.IllegalArgumentException;

public class IllegalArgumentExceptionAusloesen {
    public static void main(String[] args) {
        setzeAlter(-1);  // Dies löst eine IllegalArgumentException aus
    }

    public static void setzeAlter(int alter) {
        if (alter < 0) {
            throw new IllegalArgumentException("Alter darf nicht negativ sein.");
        }
        System.out.println("Das Alter ist: " + alter);
    }
}
