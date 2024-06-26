package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte;
import java.util.Objects;
// NullPointerException

public class String_Objekt_Null_Abfangen {
    public static void main(String[] args) {
        String a = null;

        try {
            Objects.requireNonNull(a, "Parameter darf nicht null sein");
        } catch (java.lang.NullPointerException e) {
            System.out.println(e.getMessage()); // Gibt "Parameter darf nicht null sein" aus
        }

    }
}
