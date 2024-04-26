package LF11aV2_LZK_JAVA;

/* Code Beschreibung.
 * In der "main" Methode werden zwei boolesche Variablen "b1" und "b2" initialisiert und mit den Ergebnissen von logischen Ausdrücken initialisiert.
 * Der Ausdruck für "b1" ist "(5.0 != 6.0) && (4 !=5)". Hier wird überprüft, ob 5.0 ungleich 6.0 ist (was wahr ist) und ob 4 ungleich 5 ist (was ebenfalls wahr ist).
 * Da beide Bedingungen mit dem logischen "&&" Operator verknüpft sind, müssen beide wahr sein, damit "b1" wahr ist.
 * Der Ausdruck für "b2" ist "(4 != 4) || (4 == 4)". Hier wird überprüft, ob 4 ungleich 4 ist (was falsch ist) oder ob 4 gleich 4 ist (was wahr ist).
 * Da mindestens eine der Bedingungen mit dem logischen "||" Operator wahr ist, ist "b2" wahr.
 * Schließlich werden die Werte von "b1" und "b2" mit "System.out.println" ausgegeben. = true & true.
 * Das liegt daran, dass "b1" wahr ist, da beide Bedingungen wahr sind, und "b2" ebenfalls wahr ist, da mindestens eine der Bedingungen wahr ist.
 * */
public class LZK5 {
    public static void main(String[] args) {

        boolean b1 = (5.0 != 6.0) && (4 != 5); // und operation
        boolean b2 = (4 != 4) || (4 == 4);
        System.out.println("b1 " + b1 + "\\nb2 " + b2);
    }
}
