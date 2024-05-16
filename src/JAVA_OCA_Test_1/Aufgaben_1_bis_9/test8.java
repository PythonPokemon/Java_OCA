package JAVA_OCA_Test_1.Aufgaben_1_bis_9;

/*
* Die main()-Methode, die den Einstiegspunkt für die Ausführung eines Java-Programms darstellt,
* muss immer öffentlich sein und genau die Signatur public static void main(String[] args) haben.
*
* Dies liegt daran, dass der Java-Laufzeitumgebung (java-Befehl) diese Methode benötigt, um das Programm zu starten.
* Das bedeutet, dass unabhängig von der Sichtbarkeit (public, private oder protected) der Klasse, die main()-Methode öffentlich sein muss.
* Wenn du versuchst, die main()-Methode als private oder protected zu deklarieren,
* wird dies zu einem Compilerfehler führen und das Programm wird nicht kompilieren.
* */

public class test8 {
//      Variante 1 | auskommentieren zum testen
    public static void main(String[] args) {
        System.out.println("Hurrah! I passed...");
    }

//     Variante 2
//    static public void main(String[] args) {System.out.println("Hurrah! I passed...");}
}
