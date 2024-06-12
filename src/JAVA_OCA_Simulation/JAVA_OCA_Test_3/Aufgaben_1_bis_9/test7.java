/*
Betrachten Sie den folgenden Lambda-Ausdruck:
Predicate predicate = s -> true;

Welcher Lambda-Ausdruck kann den Lambda-Ausdruck in der obigen Anweisung erfolgreich ersetzen?
------------------------------------------------------------------------------------------------------------------------
s -> {return true}

s -> {true}

Richtige Antwort
s -> {return true;}

s -> {true;}
------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
Im Hauptteil des Lambda-Ausdrucks müssen, falls verwendet, alle 3 [return, {}, ;] zusammen verwendet werden.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test7 {
}
