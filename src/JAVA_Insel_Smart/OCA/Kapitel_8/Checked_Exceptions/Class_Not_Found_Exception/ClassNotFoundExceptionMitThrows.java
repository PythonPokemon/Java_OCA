package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.Class_Not_Found_Exception;


public class ClassNotFoundExceptionMitThrows {
    public static void main(String[] args) {

        String klassenName1 = "com.example.NichtExistierendeKlasse"; // Variable außerhalb des try-Blocks definiert

        try {
            ladeKlasse1(klassenName1);
        } catch (ClassNotFoundException e) {
            System.out.println("Fehler: Klasse " + klassenName1 + " nicht gefunden.");
        }
    }

    public static void ladeKlasse1(String klassenName1) throws ClassNotFoundException {
        Class.forName(klassenName1);
        System.out.println("Klasse " + klassenName1 + " erfolgreich geladen.");
    }
}
