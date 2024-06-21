package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected;

public class SamePackageClass {
    public static void main(String[] args) {

        // erstellung der ObjektInstanz für die Klasse 'BaseClass' pflicht, weil nicht statisch!
        BaseClass objektInstanzDummy1 = new BaseClass();
        // Die Instanz der Klasse, ruft die methode in der Klasse auf.
        objektInstanzDummy1.geschuetzeMethode(); //

        // das kann man so oft wiederholen so lange der speicher reicht XD | fast wie beim Sonderschlussverkauf
        BaseClass objektInstanzDummy2 = new BaseClass();
        objektInstanzDummy2.geschuetzeMethode();

        // Aufruf der Methode direkt über den Klassen namen,
        // da die methode statisch ist, braucht man kein Objekt_Instanz_Dummy
        BaseClass.geschuetzStatischeMethode();

    }
}
