/*
 * Gesamterklärung
Bitte beachten Sie, dass Zeichenfolgen, die zur Kompilierzeit durch Verkettung berechnet werden, während der Ausführung vom Zeichenfolgenpool referenziert werden.
Kompilierzeit Die Verkettung von Strings tritt auf, wenn beide Operanden Kompilierzeitkonstanten sind, z. B. Literal, endgültige Variable usw.
*
Während Zeichenfolgen, die durch Verkettung zur Laufzeit berechnet werden (wenn der resultierende Ausdruck kein konstanter Ausdruck ist),
* neu erstellt werden und daher unterschiedlich sind.
*
-------------------fName ist eine konstante Variable und lName ist eine nicht konstante Variable.-----------------------
'fName + lName' ist kein konstanter Ausdruck und daher wird der Ausdruck zur Laufzeit berechnet und
das resultierende String-Objekt "JamesGosling" wird nicht vom String Pool referenziert.
* ----------------------------------------------------------------------------------------------------------------------
Da fName eine konstante Variable ist und "Gosling" ein String-Literal ist, ist der Ausdruck 'fName + "Gosling"' ein konstanter Ausdruck,
daher wird der Ausdruck zur Kompilierzeit berechnet und ergibt das String-Literal "JamesGosling".
*
Während der Kompilierung übersetzt der Java-Compiler also die Anweisung
String name2 = fName + "Gosling";
An
String name2 = "JamesGosling";
Da "JamesGosling" ein String-Literal ist, wird es zur Laufzeit von String Pool referenziert.
Zur Laufzeit beziehen sich name1 und name2 also auf unterschiedliche String-Objekte, weshalb name1 == name2 false zurückgibt.
'"James" + "Gosling"' ist auch ein konstanter Ausdruck und daher übersetzt der Java-Compiler die Aussage
String name3 = "James" + "Gosling";
An
String name3 = "JamesGosling";
Das bedeutet, dass die Variable 'name3' zur Laufzeit auf dasselbe String-Pool-Objekt "JamesGosling" verweist, auf das von der Variablen 'name3' verwiesen wird.
Name2 und Name3 beziehen sich also auf dasselbe String-Objekt und deshalb gibt name2 == name3 true zurück.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_1_bis_9;

public class test6 {
    public static void main(String[] args) {
        final String fName = "James";       // ist eine konstante variable weil sie final ist
        String lName = "Gosling";           // nicht konstante variable | wenn es auch final deklariert sein würde | dann wäre der output true:true
        String name1 = fName + lName;       // kein konstanter ausdruck, wird nicht im Stringpool referenziert, muss zur laufzeit neu berechnet werden.
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2); // false, weil name1 = auf 2 bezeichner zurückgreift die nicht im konstanten Stringpool sind
        System.out.println(name2 == name3); // true
    }
}
