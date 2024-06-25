/*
Erklärung
Die Methode length() wird innerhalb eines try-catch-Blocks aufgerufen.
Wenn eine NullPointerException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
Überprüfen auf null:

Überprüfen Sie immer, ob ein Objekt null ist, bevor Sie auf seine Methoden oder Felder zugreifen.
Verwenden Sie if-Bedingungen oder Try - Catch Blöcke um null-Überprüfungen durchzuführen:

if (text != null) {
    System.out.println(text.length());
} else {
    System.out.println("Das Objekt ist null.");
}
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.NullPointerException;

public class NullPointerExceptionAusloesen {

    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length());  // Dies löst eine NullPointerException aus

//---------------------------Damit prüft man ob das Objekt 'null' ist |ZUM TESTEN | Auskommentieren---------------------
//        if (text != null) {
//            System.out.println(text.length());
//        } else {
//            System.out.println("Das Objekt ist null.");
//        }
//----------------------------------------------------------------------------------------------------------------------
    }
}
