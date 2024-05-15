/*
 * FileNotFoundException:
 * Diese Ausnahme wird ausgelöst, wenn versucht wird, auf eine Datei zuzugreifen, die nicht gefunden werden kann.
 *
 * ExceptionInInitializerError:
 * Diese Ausnahme wird ausgelöst, wenn ein statischer Initialisierungsblock oder eine statische Variable einer Klasse eine Exception wirft,
 * die nicht abgefangen wird.
 *
 * RuntimeException:
 * Diese Ausnahme ist die Oberklasse für alle Laufzeit-Ausnahmen, die in Java ausgelöst werden.
 * Sie muss nicht explizit gefangen oder deklariert werden.
 *
 * ClassCastException:
 * Diese Ausnahme wird ausgelöst, wenn versucht wird, eine Instanz einer Klasse in eine andere Klasse zu casten,
 * zu der sie nicht kompatibel ist.
 *  */

package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;

//public class test58 {
//    public static void main(String[] args) {
//
//        // FileNotFoundException | zum Testen auskommentieren
//        try {
//            File file = new File("not_existing_file.txt");
//            FileInputStream fis = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("Datei nicht gefunden: " + e.getMessage());
//        }
//    }
//----------------------------------------------------------------------------------------------------------------------
//    // ExceptionInInitializerError | zum Testen auskommentieren
//    public class test58 {
//        static {
//            int[] arr = new int[2];
//            System.out.println(arr[5]); //<-- Hier wird ein ArrayIndexOutOfBoundsException ausgelöst
//        }
//
//        public static void main(String[] args) {
//            System.out.println("Main-Methode");
//        }
//    }
//----------------------------------------------------------------------------------------------------------------------
//  RuntimeException | zum Testen auskommentieren
//public class test58 {
//    public static void main(String[] args) {
//        int x = 5;
//        int y = 0;
//        int result = x / y; //<-- Hier wird eine ArithmeticException ausgelöst
//        System.out.println("Ergebnis: " + result);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//  ClassCastException | zum Testen auskommentieren
public class test58 {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        String str = (String) obj; // Hier wird eine ClassCastException ausgelöst, da Integer nicht in String umgewandelt werden kann
    }
}

