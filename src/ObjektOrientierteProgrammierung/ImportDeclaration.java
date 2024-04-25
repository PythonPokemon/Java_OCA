package ObjektOrientierteProgrammierung;

import java.util.Scanner;
import java.awt.*;

/*
*   - Volle Qualifizierung vs import Deklaration
* */
public class ImportDeclaration {
    public static void main(String[] args) {
//-------Variante selbst ausschreiben----------------------
//        System.out.println("x=");
//        int x = new java.util.Scanner(System.in).nextInt();
//        System.out.println("y=");
//        int y = new java.util.Scanner(System.in).nextInt();
//
//        // Variante 3 smart
//        java.awt.Point point = new java.awt.Point(x, y);
//        // Variante 1 point.x/y=
//        // Variante 2 point.setLocation(x,y)
//        System.out.println(point.distance(0, 0));

//------Import Variante, die auf die obigen Importe verweist
        // import java.util.Scanner;
        // import java.awt.*;
        System.out.println("x=");
        int x = new Scanner(System.in).nextInt();
        System.out.println("y=");
        int y = new Scanner(System.in).nextInt();

        // Variante 3 smart
        Point point = new Point(x, y);
        // Variante 1 point.x/y=
        // Variante 2 point.setLocation(x,y)
        System.out.println(point.distance(0, 0));

    }
}
