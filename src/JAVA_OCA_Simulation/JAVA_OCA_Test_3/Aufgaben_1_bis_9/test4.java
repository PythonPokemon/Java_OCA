/*
Welche dieser Top-Level-Klassen kann nicht untergeordnet werden?
Which one of these top level classes cannot be sub-classed?

abstract class Cat {}

private class Car {}

class Dog {}

Correct answer
final class Electronics {}

Gesamterklärung
class Dog {}: can be sub-classed within the same package.

abstract class Cat {}: can be sub-classed within the same package.

final class Electronics {}: a class with final modifier cannot be sub-classed.

private class Car {}: a top level class cannot be declared with private modifier.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test4 {
    public static void main(String[] args) {

    }

    abstract class Cat {}

    private class Car {}

    class Dog {}


    final class Electronics {}  // richtig
}
