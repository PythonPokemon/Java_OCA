package JAVA_Insel_Smart.Kapitel_3;
import java.awt.Point;

public class ZweiVerweiseEinObjekt {
    public static void main( String[] args ) {
        Point p = new Point(); // p referenzvariable wird auf ein 0bjekt verweiesen
        Point q = p;            // p

        p.x = 10;
        System.out.println( q.x ); // 10

        q.y = 5;
        System.out.println( p.y ); // 5

    }
}
