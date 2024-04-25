package ObjektOrientierteProgrammierung;
/*
* Lernziel:
* - public, private
* - Paketsichtbarkeit
* */

public class PrivatePublicPackageVisible {
    public static void main(String[] args) {
        Line.line();
    }
}

class Line {
    static void line(){
        System.out.println( "---" );
    }
}