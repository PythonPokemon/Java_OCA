/*
* Der Compiler fehler tritt aufgrund der Unvollständigkeit des ternären Operators (?:) in diesem Code auf.
* In Java muss der ternäre Operator immer drei Operanden haben: ein Bedingungsausdruck gefolgt von einem Ausdruck,
* der ausgewertet wird, wenn die Bedingung wahr ist, und einem Ausdruck, der ausgewertet wird, wenn die Bedingung falsch ist.

In diesem Code sind zwei Bedingungsausdrücke hintereinander ohne einen Ausdruck, der ausgewertet wird, wenn die Bedingung wahr ist. Das führt zu einem Compilerfehler.
*
In Java ist das Fragezeichen ? ein ternärer Operator, der als bedingter Operator bekannt ist.
* Der ternäre Operator hat die folgende Syntax: bedingung ? ausdruck1 : ausdruck2
*
Das Doppelpunkt-Zeichen (:) in Java wird verwendet, um zwischen den beiden möglichen Ausdrücken zu trennen, die im ternären Operator (? :) verwendet werden.
* Es fungiert als Trennzeichen zwischen dem Ausdruck, der ausgewertet wird, wenn die Bedingung wahr ist, und dem Ausdruck, der ausgewertet wird, wenn die Bedingung falsch ist.
* */

package JACA_OCA_Test_1.Aufgaben_20_bis_29;
import  java.time.LocalTime;


// Compiler fehler | zum Testen auskommentieren
//public class test21 {
//    public static void main(String[] args) {
//    LocalTime time = LocalTime.of(16, 40);
//    String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";    // <-- fehler
//        System.out.println(amPm);
//    }
//}

// Korrekt wäre das!
public class test21 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12 ? "PM" : "PM") : "AM";   // <--
        System.out.println(amPm);
    }
}