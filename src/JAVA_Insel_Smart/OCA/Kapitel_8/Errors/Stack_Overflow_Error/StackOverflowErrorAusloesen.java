/*
Erklärung
In diesem Beispiel ruft die Methode rekursiveMethode sich selbst auf.
Da es keine Abbruchbedingung gibt, führt dies zu einer unendlichen Rekursion und schließlich zu einem StackOverflowError.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Errors.Stack_Overflow_Error;

public class StackOverflowErrorAusloesen {
    public static void main(String[] args) {
        rekursiveMethode();
    }

    public static void rekursiveMethode() {
        rekursiveMethode();  // Unendliche Rekursion
    }
}
