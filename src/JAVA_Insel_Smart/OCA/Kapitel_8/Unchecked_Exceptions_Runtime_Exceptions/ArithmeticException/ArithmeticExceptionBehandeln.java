package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArithmeticException;

public class ArithmeticExceptionBehandeln {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int ergebnis = a / b;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch null ist nicht erlaubt.");
        }
    }
}
