package JAVA_Insel_Smart.OCA.Kapitel_3;
import java.awt.Point;

public class ZweiVerweiseEinObjekt {
    public static void main( String[] args ) {
        Point p = new Point(); // p referenzvariable wird auf ein 0bjekt verweiesen
        Point q = p;            // p wird q zugewiesen

        p.x = 10;
        System.out.println( q.x ); // 10

        q.y = 5;
        System.out.println( p.y ); // 5
                                            //<---ACHTUNG WICHTIG--->
        System.out.println(q.equals(p));    // referenzvariablen p und q verweisen beide auf ein 'Objekt' !!!
                                            // und sind inhaltlich identisch, deshalb true!
    }
}
