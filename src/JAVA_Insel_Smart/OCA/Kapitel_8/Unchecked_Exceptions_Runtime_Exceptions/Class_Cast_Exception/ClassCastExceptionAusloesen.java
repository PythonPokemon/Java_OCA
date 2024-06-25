/*
Erklärung
In diesem Beispiel wird ein String-Objekt als Object gespeichert.
Der Versuch, dieses Object in einen Integer zu konvertieren, führt zu einer ClassCastException,
da String nicht in Integer konvertiert werden kann.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.Class_Cast_Exception;

public class ClassCastExceptionAusloesen {
    public static void main(String[] args) {
        Object obj = new String("Hallo Welt");
        Integer zahl = (Integer) obj;  // Dies löst eine ClassCastException aus


    }
}
