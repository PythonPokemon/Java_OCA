package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_10_bis_19;
/*
 * In diesem Code tritt eine Ausnahme auf, wenn die statische Initialisierung des Klassenblocks durchgeführt wird.
 * Der Code im statischen Initialisierungsblock wird ausgeführt, bevor die main()-Methode aufgerufen wird.
 * Wenn eine Ausnahme während der Ausführung des statischen Initialisierungsblocks auftritt, wird der Code darunter nicht mehr erreicht.
 * In dem Fall führt der Ausdruck System.out.println(1/0); im statischen Initialisierungsblock zu einer Division durch Null, was eine ArithmeticException verursacht.
 * Da eine Ausnahme im statischen Initialisierungsblock auftritt, wird die main()-Methode nicht erreicht und daher wird "HELLO" nicht in der Konsole ausgegeben.
 * */


//------ArithmeticException | zum Testen auskommentieren!

public class test16 {
    static {
        System.out.println(1/0);    // einfach weglassen die division durch null
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 * Um "HELLO" in der Konsole auszugeben, musst du sicherstellen, dass der Code im statischen Initialisierungsblock erfolgreich ausgeführt wird.
 * Das bedeutet, dass du sicherstellen musst, dass keine Ausnahmen auftreten.
 * In diesem Fall könntest du z.B. die Division durch Null im statischen Initialisierungsblock vermeiden.
 *
 * Hier ist ein Beispiel:
 * */

// Korrekt wäre das!
//public class test16 {
//    static {
//        try {
//            System.out.println(1 / 1); // Avoid division by zero
//        } catch (ArithmeticException e) {
//            e.printStackTrace(); // Handle the exception if necessary
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("HELLO");
//    }
//}
