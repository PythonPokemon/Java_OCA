/*
Erklärung
Der Typumwandlungsversuch wird innerhalb eines try-catch-Blocks platziert.
Wenn eine ClassCastException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.Class_Cast_Exception;

public class ClassCastExceptionBehandeln {
    public static void main(String[] args) {
        Object obj = new String("Hallo Welt");

        try {
            Integer zahl = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Fehler: Ungültiger Typumwandlungsversuch.");
        }
    }
}
