package JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.b;

import JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.a.AccessTest;

public class SubclassAccess extends AccessTest {
    public static void main(String[] args) {
        SubclassAccess obj = new SubclassAccess();

        // Zugriff auf verschiedene Mitglieder
        // obj.packagePrivateVar = 1; // Nicht erlaubt (Kompilierfehler)
        // obj.privateVar = 2; // Nicht erlaubt (Kompilierfehler)
        obj.protectedVar = 3; // Erlaubt
        obj.publicVar = 4; // Erlaubt

        // obj.packagePrivateMethod(); // Nicht erlaubt (Kompilierfehler)
        // obj.privateMethod(); // Nicht erlaubt (Kompilierfehler)
        obj.protectedMethod(); // Erlaubt
        obj.publicMethod(); // Erlaubt
    }
}