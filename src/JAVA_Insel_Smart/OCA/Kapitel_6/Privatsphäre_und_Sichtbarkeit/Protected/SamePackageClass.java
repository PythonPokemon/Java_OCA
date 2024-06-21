package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected;

public class SamePackageClass {
    public static void main(String[] args) {

// erstellung der ObjektInstanz für die Klasse 'BaseClass' pflicht, weil nicht statisch!
        BaseClass objektInstanzDummy1 = new BaseClass();
        objektInstanzDummy1.geschuetzeMethode(); //

    }
}
