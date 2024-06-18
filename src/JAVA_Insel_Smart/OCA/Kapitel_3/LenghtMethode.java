package JAVA_Insel_Smart.OCA.Kapitel_3;

public class LenghtMethode {
    public static void main(String[] args) {
        //Die Methode toString() liefert, wie wir gesehen haben, als Ergebnis
        //ein String-Objekt:
        java.awt.Point p = new java.awt.Point();
        String s = p.toString();
        System.out.println( s ); // java.awt.Point[x=0,y=0]

        //Das String-Objekt besitzt selbst wieder Methoden. Eine davon ist
        //length(), die die Länge der Zeichenkette liefert:
        System.out.println( s.length() ); // 23

        //Das Erfragen des String-Objekts und seiner Länge können wir zu
        //einer Anweisung verbinden; wir sprechen von kaskadierten
        //Aufrufen.
        java.awt.Point pl = new java.awt.Point();
        System.out.println( pl.toString().length() ); // 23 als Zeichenkette ausgegeben

    }
}
