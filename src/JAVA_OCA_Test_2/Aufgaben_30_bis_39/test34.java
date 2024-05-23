/*
What will be the result of compiling and executing Test class using below commands?
------------------------------------------------------------------------------------------------------------------------
Der Wert von flag wird durch die Initialisierung private static boolean flag = !true; festgelegt.
Hier wird !true ausgewertet, was false ergibt. Daher ist flag false.

In der bedingten Ausdrucksanweisung System.out.println(!flag ? args[0] : args[1]);
wird der Ausdruck !flag zu true ausgewertet, da flag false ist. Daher wird args[0] ausgegeben,
was das erste übergebene Argument ist, nämlich "AM".
------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
Es liegt kein Kompilierungsfehler vor.
Wenn die Testklasse von der JVM in die aufgerufene main(String [])-Methode geladen wird,
werden die Deklaration statischer Variablen und die Initialisierungsanweisung ausgeführt und false dem Flag zugewiesen,
* da !true false ist.

Da der Java-Befehl Test AM PM verwendet wird, wird args[0] --> "AM" und args[1] --> "PM" verwendet.
Im ternären Operator wird zuerst der boolesche Ausdruck ausgewertet, !flag wird als true ausgewertet und daher agrs[0] zurückgegeben.
AM wird auf die Konsole gedruckt.
------------------------------------------------------------------------------------------------------------------------
javac Test.java
java Test AM PM
------------------------------------------------------------------------------------------------------------------------
Compilation error

PM

Correct answer
AM

ExceptionInInitializerError is thrown while loading the Test class
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;

//public class test34 {
//    private static boolean flag = !true;
//
//    public static void main(String [] args) {
//        System.out.println(!flag ? args[0] : args[1]);
//    }
//}
