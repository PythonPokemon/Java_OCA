/*
NullPointerException wird zur Laufzeit ausgelöst

Gesamterklärung
Alle Arrayelemente werden mit ihren Standardwerten initialisiert. arr ist vom booleschen Typ (Referenztyp), daher wird arr[0] auf null initialisiert.

Wenn der Ausdruck mit einer Variablen vom Typ Boolean funktioniert, gibt "if(arr[0])" keinen Kompilierungsfehler aus,
aber die Java-Laufzeit extrahiert den in arr[0] gespeicherten booleschen Wert und verwendet die Methode booleanValue().

arr[0].booleanValue() bedeutet, dass die Methode booleanValue() bei einer Nullreferenz aufgerufen wird und daher NullPointerException zur Laufzeit ausgelöst wird.
 * */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;

//public class test8 {
//    static Boolean[] arr = new Boolean[1];
//    public static void main(String[] args) {
//        if(arr[0]) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//}
