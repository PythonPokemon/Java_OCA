/*
 * Gesamterklärung
Beide Klassen enthalten eine spezielle main-Methode. Kein Kompilierungsfehler mit dem Code: Datei wird korrekt als Guest.java benannt (Name der öffentlichen Klasse).

java Guest James Gosling übergibt new String [] {"James", "Gosling"} an Argumente der Guest.main-Methode.
Abgesehen davon, dass es sich um eine spezielle Hauptmethode handelt, ist Message.main eine statische Methode,
so dass die Guest.main-Methode die Message.main-Methode mit demselben Argument aufruft: new String [] {"James", "Gosling"}.

args[0] ist "James", daher wird "Welcome James!" auf die Konsole gedruckt.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test14 {

}

//class Message {
//    public static void main(String [] args) {
//        System.out.println("Welcome " + args[0] + "!");
//    }
//}
//
//public class Guest {
//    public static void main(String [] args) {
//        Message.main(args);
//    }
//}