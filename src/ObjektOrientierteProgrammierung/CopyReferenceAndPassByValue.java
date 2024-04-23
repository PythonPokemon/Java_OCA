package ObjektOrientierteProgrammierung;

public class CopyReferenceAndPassByValue {

    // main Methode
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

        printPoint(p);
    }

    // die variable p von oben wird ausgelesen und in die untere Methode kopiert
    // haben aber sonst nix miteinander zu tun die zwei p sind völlig verschieden

    // printPoint Methode
    static void printPoint(java.awt.Point p){
        System.out.println(p.x);    // gibt exact die daten von p aus, die aus der main Methode koordinate p.x = 10 als variable zwischengespeichert wurden
        System.out.println(p.y);    // gibt exact die daten von p aus, die aus der main Methode koordinate p.y = 20 als variable zwischengespeichert wurden
    }
}
