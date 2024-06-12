/*
 * Kompilierungsfehler für den Child(int, int)-Konstruktor
 * ---------------------------------------------------------------------------------------------------------------------
Der Fehler in diesem Code liegt in der Zeile this(j); im Konstruktor Child(int i, int j).
In Java kann der Konstruktoraufruf this(...) nur als erste Anweisung im Konstruktor verwendet werden.
Wenn Sie this(j); aufrufen möchten, um den anderen Konstruktor Child(int j) aufzurufen,
müssen Sie dies als erste Anweisung im Konstruktor Child(int i, int j) tun.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_50_bis_59;

//class Parent {
//    int i = 10;
//    Parent(int i) {
//        super();
//        this.i = i;
//    }
//}
//
//class Child extends Parent {
//    int j = 20;
//
//    Child(int j) {
//        super(0);
//        this.j = j;
//    }
//      //Ein Konstruktor sollte super(...) oder this(...) haben, aber nicht beides. Daher verursacht Child(int, int) einen Kompilierungsfehler.
//    Child(int i, int j) {
//        super(i);
//        this(j);    // korrekt wär | this.j =j;
//    }
//
//}
//
//public class test51 {
//    public static void main(String[] args) {
//        Child child = new Child(1000, 2000);
//        System.out.println(child.i + ":" + child.j);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
Durch diese Korrektur wird der Konstruktor Child(int j) aufgerufen, wenn Child(int i, int j) aufgerufen wird.
* */
class Parent {
    int i = 10;
    Parent(int i) {
        super();
        this.i = i;
    }
}

class Child extends Parent {
    int j = 20;

    Child(int j) {
        super(0); // Aufruf des Konstruktors der Elternklasse
        this.j = j;
    }

    Child(int i, int j) {
        super(i); // Aufruf des Konstruktors der Elternklasse
        this.j = j;
    }
}

public class test51 {
    public static void main(String[] args) {
        Child child = new Child(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}

/*
Die Methode super() wird in Java-Konstruktoren verwendet, um den Konstruktor der Elternklasse aufzurufen.
Normalerweise wird dies implizit durch den Compiler eingefügt, wenn kein expliziter Aufruf vorhanden ist.
Wenn Sie jedoch einen Konstruktor in einer Unterklasse schreiben und diesen nicht explizit aufrufen,
wird automatisch der Standardkonstruktor der Elternklasse aufgerufen.

Es ist wichtig zu beachten, dass der Aufruf von super() als erste Anweisung im Konstruktor der Unterklasse erfolgen muss.
Andernfalls tritt ein Compilerfehler auf.
Dies liegt daran, dass der Konstruktor der Elternklasse zuerst ausgeführt werden muss,
um die Zustände der Elternklasse ordnungsgemäß zu initialisieren, bevor die Unterklasse initialisiert wird.

Im gegebenen Beispiel ruft die Zeile super(0);
den Parameterkonstruktor der Elternklasse Parent(int i) auf und übergibt dabei den Wert 0.
Dadurch wird die Instanzvariable i der Elternklasse initialisiert.
Anschließend wird this.j = j; verwendet, um die Instanzvariable j der Unterklasse zu initialisieren.

Der Konstruktor Child(int i, int j) ist eine Überladung des anderen Konstruktors Child(int j).
In diesem Fall soll der Benutzer die Möglichkeit haben, einen Wert für i und j zu übergeben, um die Instanz der Klasse Child zu erstellen.

In dem Konstruktor Child(int i, int j) wird super(i); verwendet,
um den Parameterkonstruktor der Elternklasse aufzurufen und den Wert i zu übergeben.
Dadurch kann die Instanzvariable i der Elternklasse initialisiert werden. Anschließend wird this.j = j; verwendet,
um die Instanzvariable j der Unterklasse zu initialisieren.

Insgesamt erlaubt dies dem Benutzer, verschiedene Konstruktoren zu verwenden,
um Instanzen der Klasse Child mit unterschiedlichen Parametern zu erstellen.
* */