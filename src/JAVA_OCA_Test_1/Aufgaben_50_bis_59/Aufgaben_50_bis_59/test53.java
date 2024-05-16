package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;

//public class test53 {
//    public static void main(String[] args) {

//        // Variante 1 | Compiler fehler | zum Testen auskommentieren
//        double price = 90000;
//        String model;                   //<-- nicht initialisiert
//        if (price > 100000) {
//            model = "Tesla Model X";
//        } else if (price <= 10000) {
//            model = "Tesla Mdel S";
//        }
//        System.out.println(model);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

//public class test53 {
//    public static void main(String[] args) {
//
//        // Variante 2 | Richtig | zum Testen auskommentieren
//        // werte zwischen 10.001 ~ 99.999 = Compiler fehler
//        double price = 100000;
//        String model = "";          //<-- initialisiert
//        if (price >= 100000) {
//            model = "Tesla Model X";
//        } else if (price <= 10000) {
//            model = "Tesla Model S";
//        }
//        System.out.println(model);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

public class test53 {
    public static void main(String[] args) {

        // Variante 3 | Richtig | zum Testen auskommentieren
        // werte zwischen 10.001 ~ 99.999 = werden aufgefangen
        double price = 90000;
        String model;
        if (price >= 100000) {
            model = "Tesla Model X";
        } else if (price <= 10000) {
            model = "Tesla Model S";
        } else {
            model = "Andere Tesla-Modelle"; // Fallback-Wert, falls keine der Bedingungen zutrifft
        }
        System.out.println(model);
    }
}