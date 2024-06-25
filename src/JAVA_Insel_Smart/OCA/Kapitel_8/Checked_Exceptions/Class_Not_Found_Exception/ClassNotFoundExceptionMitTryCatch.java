package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.Class_Not_Found_Exception;

public class ClassNotFoundExceptionMitTryCatch {
    public static void main(String[] args) {
        ladeKlasse("com.example.NichtExistierendeKlasse");
    }

    public static void ladeKlasse(String klassenName) {

        try {
            Class.forName(klassenName);
            System.out.println("Klasse " + klassenName + " erfolgreich geladen.");
        } catch (ClassNotFoundException e) {
            System.out.println("Fehler: Klasse " + klassenName + " nicht gefunden.");
        }

    }
}
