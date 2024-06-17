package JAVA_Insel_Smart.Kapitel_3;

public class NullPointer {
    public static void main(String[] args) { // 3
//        java.awt.Point p = null; // 4
//        String s = null; // 5
//
//        p = new java.awt.Point();
//        s = "";
//
//        p.setLocation(1, 2); // 6
//        s.length(); // 7
//----------------------------------------------------------------------------------------------------------------------
        // Objekt referenz testen
        String s = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
        if ( s != null && ! s.isEmpty() )
            System.out.println( "Eingabe: " + s );
        else
            System.out.println( "Abbruch oder keine Eingabe" );

    }
}
