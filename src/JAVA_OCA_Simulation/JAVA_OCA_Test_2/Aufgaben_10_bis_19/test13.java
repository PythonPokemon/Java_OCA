/*
Following statement in a Java program compiles successfully:

student.report(course);

What can you say for sure?
------------------------------------------------------------------------------------------------------------------------
Correct answer
report is the method name

student is the class name

student is the reference variable name

course must be of String type
------------------------------------------------------------------------------------------------------------------------
*
* Gesamterklärung
Es empfiehlt sich, das erste Zeichen des Klassennamens in Großbuchstaben zu schreiben, aber es ist nicht zwingend erforderlich.

Student kann entweder Klassenname oder Referenzvariablenname sein.


Die Syntax zum Aufrufen der statischen Methode lautet: Class_Name.method_name(<arguments>); ODER reference_variable_name.method_name(<argumente>);

Die Syntax zum Aufrufen der Instanzmethode lautet: reference_variable_name.method_name(<arguments>);

Wenn student class_name oder refernce_variable_name darstellt, ist report möglicherweise die statische Methode der Klasse.

Wenn student reference_variable_name darstellt, ist report die Instanzmethode der Klasse.

In beiden Fällen muss report der Methodenname sein.



Die Art des Arguments kann nicht durch einen Blick auf die obige Syntax ermittelt werden.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test13 {
}
