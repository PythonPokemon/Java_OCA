package ObjektOrientierteProgrammierung;
/*
 * Lernziel:
 * - public, private
 * - Paketsichtbarkeit
 * */

public class PrivatePublicPackageVisible {
    public static void main(String[] args) {
        Line.longLine();
    }
}

class Line {
    private static void line() {    // private ist für andere nicht sichtbar
        System.out.println("---");
    }


    public static void longLine() { // wenn nichts steh, it ist default, also öffentlich
        line(); line();
    }
}