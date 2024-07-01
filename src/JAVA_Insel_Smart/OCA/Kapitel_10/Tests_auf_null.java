package JAVA_Insel_Smart.OCA.Kapitel_10;
import java.util.Objects;
// Tests_auf_null
public class Tests_auf_null {
    public static void main(String[] args) {
        String a = null;

        System.out.println(Objects.isNull(a));   // Gibt true aus
        System.out.println(Objects.nonNull(a));  // Gibt false aus
    }
}
