/*
 * P2D
 *
 * Die Methoden of und ofXXX sind statische Methoden und keine Instanzmethoden.

Period.of(2, 1, 0) => gibt eine Instanz des Typs Period zurück.

Statische Methoden können mit class_name oder mit einer Referenzvariablen aufgerufen werden. In diesem Fall wird ofYears(10) für die Periodeninstanz aufgerufen, aber der Compiler verwendet die Instanz von Period, um den Typ aufzulösen, der period ist. Eine neue Periodeninstanz {P10Y} wird erstellt, danach wird eine weitere Periodeninstanz {P5M} erstellt und schließlich wird die Periodeninstanz {P2D} erstellt.

Diese Instanz wird der Periodenreferenzvariablen zugewiesen und somit P2D auf die Konsole gedruckt.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_50_bis_59;
import java.time.Period;

public class test55 {
    public static void main(String [] args) {
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2); // gibt die letzte methode aus mit dem element
        System.out.println(period); // also anstatt P2Y1MoD wird P2D ausgedruckt
    }
}
