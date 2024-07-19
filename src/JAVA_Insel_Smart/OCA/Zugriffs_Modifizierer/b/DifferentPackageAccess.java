package JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.b;

import JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.a.AccessTest;

public class DifferentPackageAccess {
    public static void main(String[] args) {
        AccessTest obj = new AccessTest();

        // Zugriff auf verschiedene Mitglieder
        // obj.packagePrivateVar = 1; // Nicht erlaubt (Kompilierfehler)
        // obj.privateVar = 2; // Nicht erlaubt (Kompilierfehler)
        // obj.protectedVar = 3; // Nicht erlaubt (Kompilierfehler)
        obj.publicVar = 4; // Erlaubt
        System.out.println(obj.publicVar);

        // obj.packagePrivateMethod(); // Nicht erlaubt (Kompilierfehler)
        // obj.privateMethod(); // Nicht erlaubt (Kompilierfehler)
        // obj.protectedMethod(); // Nicht erlaubt (Kompilierfehler)
        obj.publicMethod(); // Erlaubt
    }
}