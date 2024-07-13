/*
Hinweise
Methoden und Konstruktoren sind unterschiedlich.
------------------------------------------------------------------------------------------------------------------------
Konstruktoren haben keinen Rückgabewert und haben den gleichen Namen wie die Klasse.
Methoden können Rückgabewerte haben und können beliebige Namen haben.
Die Vererbung in Java erlaubt es Unterklassen, Konstruktoren der Superklasse aufzurufen,
entweder explizit mit super() oder implizit.

Konstruktoren in einer Unterklasse müssen Konstruktoren in der Superklasse aufrufen, entweder explizit oder implizit.

Wenn kein spezifischer Konstruktor aufgerufen wird, wird der Standardkonstruktor der Superklasse aufgerufen.
 * */

package Enthuware;

//----------------------------------------------------------------------------------------------------------------------
// Klasse A
class A {
    // Standardkonstruktor (parameterloser Konstruktor) | Merkmale: keine 'void' deklaration, keine 'return' anweisung!
    public A() {
    } // A1

    // Konstruktor mit einem String-Parameter
    public A(String s) {
        this(); // Ruft den Standardkonstruktor A() auf
        System.out.println("A :" + s);
    } // A2
}

//----------------------------------------------------------------------------------------------------------------------
/*
Klasse A: Eine einfache Klasse mit zwei Konstruktoren.
Konstruktor A1: Der Standardkonstruktor, der keine Parameter hat.
Konstruktor A2: Ein Konstruktor, der einen String-Parameter akzeptiert.
Er ruft den Standardkonstruktor A() auf (this()) und gibt dann eine Nachricht aus.
* */
//----------------------------------------------------------------------------------------------------------------------
//
// Klasse B (erbt von A)
class B extends A {
    // Keine Standardkonstruktoren in B definiert, erbt die Konstruktoren von A

    // Eine Methode, die einen String-Parameter akzeptiert und einen int-Wert zurückgibt
    public int B(String s) {
        System.out.println("B :" + s);
        return 0; // <--- diese 'return' anweisung sagt aus, das es sich um eine methode handelt. !-kein Konstruktor-!
    } // B1
}

//----------------------------------------------------------------------------------------------------------------------
/*
Klasse B: Erbt von Klasse A.
Methode B1: Dies ist keine Konstruktor-Methode, sondern eine reguläre Methode,
die einen String-Parameter akzeptiert und int zurückgibt.

Beachten Sie, dass der Methodennamen mit dem Klassennamen übereinstimmt, aber da sie einen Rückgabewert hat,
ist es keine Konstruktor.
* */
//----------------------------------------------------------------------------------------------------------------------
//
// Klasse C (erbt von B)
class C extends B {
    // Privater Standardkonstruktor
    private C() {
        super(); // Ruft den Standardkonstruktor von B auf, welcher den von A aufruft
    } // C1

    // Konstruktor mit einem String-Parameter
    public C(String s) {
        this(); // Ruft den privaten Standardkonstruktor C() auf
        System.out.println("C :" + s);
    } // C2

    // Konstruktor mit einem int-Parameter
    public C(int i) {
    } // C3
}

//----------------------------------------------------------------------------------------------------------------------
/*
Klasse C: Erbt von Klasse B.
Konstruktor C1: Privater Standardkonstruktor. Ruft den Standardkonstruktor der Superklasse B auf (super()).
Konstruktor C2: Konstruktor, der einen String-Parameter akzeptiert.
Ruft den privaten Konstruktor C() auf (this()) und gibt dann eine Nachricht aus.
Konstruktor C3: Konstruktor, der einen int-Parameter akzeptiert. Er macht nichts weiter.
 * */
//----------------------------------------------------------------------------------------------------------------------
public class Klassen_Konstruktore {
    public static void main(String[] args) {

    }
}
