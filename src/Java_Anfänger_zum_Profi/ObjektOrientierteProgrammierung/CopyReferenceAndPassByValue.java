package Java_Anfänger_zum_Profi.ObjektOrientierteProgrammierung;

public class CopyReferenceAndPassByValue {

    // main Methode kann aus anderen methoden die werte in der eigenen main methode ausgeben
    public static void main(String[] args) {
        // Variante 1
        int age = 50;
        int dogAge = age;
        System.out.println(dogAge); // Gibt in der Konsole die variable 50 aus die in dogAge < age < 50 gespeichert wurde

        // Variante 2
        java.awt.Point  p = new java.awt.Point();
        java.awt.Point q = p;   // hier bekommt q die werte von p

        p.x = 10;
        System.out.println(q.x);  // gibt die werte von q in der konsole aus
        q.y = 20;
        System.out.println(p.y);

        //------Methodenzugriffe------
        printPoint(p);  // gibt wert aus der Methode aus | static void printPoint(java.awt.Point p)

        System.out.println(randomPoint());  // gibt die werte aus der Methode aus | static java.awt.Point randomPoint()

        System.out.println(clearPoint2( p ));
        System.out.println(p);
    }

    // die variable p von oben wird ausgelesen und in die untere Methode kopiert
    // haben aber sonst nichts miteinander zu tun die zwei p sind völlig verschieden

    // printPoint Methode
    static void printPoint(java.awt.Point p){
        System.out.println(p.x);    // gibt exact die daten von p aus, die aus der main Methode koordinate p.x = 10 als variable zwischengespeichert wurden
        System.out.println(p.y);    // gibt exact die daten von p aus, die aus der main Methode koordinate p.y = 20 als variable zwischengespeichert wurden
    }

    // randomPoint Methode | generiert zufallszahlen für die koordinaten x y
    static java.awt.Point randomPoint(){
        java.awt.Point point = new java.awt.Point();
        point.setLocation(Math.random() * 10, Math.random() * 20);
        return point;
    }

    // clearPoint2 Methode | löscht die koordinaten daten aus den variablen p.x & p.y = 0
    static java.awt.Point clearPoint2(java.awt.Point p){
        p.x = p.y = 0;
        return p;
    }
}
