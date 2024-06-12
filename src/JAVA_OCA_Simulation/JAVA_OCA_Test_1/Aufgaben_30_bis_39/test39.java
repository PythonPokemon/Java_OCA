/*
* Der Compilerfehler tritt auf, weil die Klasse LocalDate aus dem Paket java.time eine finale Klasse ist,
* was bedeutet, dass sie nicht abgeleitet werden kann.
*
* Das extends-Schlüsselwort wird verwendet, um eine Klasse von einer anderen Klasse zu erweitern,
* aber es ist nicht möglich, die LocalDate-Klasse zu erweitern, da sie final ist.
*
* Um dieses Problem zu lösen, können Sie stattdessen eine Komposition verwenden,
* indem Sie ein LocalDate-Objekt als Attribut in Ihrer Klasse verwenden und die gewünschten Methoden darauf aufrufen,
* oder Sie können eine eigene Klasse erstellen, die nicht von LocalDate abgeleitet ist, aber ähnliche Funktionen bereitstellt.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_30_bis_39;
import java.time.LocalDate;

// Variante 1 | zum Testen auskommentieren
//class MyLocalDate extends LocalDate{
//    @Override
//    public String toString(){
//        return super.getDayOfMonth() + "-" + super.getMonthValue() + "-" + super.getYear();
//    }
//}
//
//public class test39 {
//    public static void main(String[] args) {
//        MyLocalDate date = LocalDate.parse("1980-03-16");
//        System.out.println(date);                               // <-- Compiler fehler
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

/*
* Um das Problem zu lösen, können Sie stattdessen eine Komposition verwenden,
* indem Sie ein LocalDate-Objekt als Attribut in Ihrer Klasse verwenden und die gewünschten Methoden darauf aufrufen.
* Hier ist eine Möglichkeit, wie Sie das tun könnten:
*
* In diesem Beispiel wird die MyLocalDate-Klasse erstellt, die ein LocalDate-Objekt als Attribut date enthält.
* In der toString()-Methode der MyLocalDate-Klasse können Sie auf die Methoden des LocalDate-Objekts zugreifen,
* um das gewünschte Format für die Ausgabe zu erstellen.
* */

// Variante 2 | Komposition  mit parsen
//class MyLocalDate {
//    private LocalDate date;
//
//    MyLocalDate(LocalDate date) {
//        this.date = date;
//    }
//
//    @Override
//    public String toString() {
//        return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
//    }
//}
//
//public class test39 {
//    public static void main(String[] args) {
//        LocalDate date = LocalDate.parse("1980-03-16");                   // parse = string wird zu int
//        MyLocalDate myDate = new MyLocalDate(date);
//        System.out.println(myDate);                                       // was kommt raus?
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

// Variante 3 | Komposition | ohne parsen

class MyLocalDate {
    private LocalDate date;

    MyLocalDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
    }
}

public class test39 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1980, 3, 16); // ohne parse
        MyLocalDate myDate = new MyLocalDate(date);
        System.out.println(myDate);                                        // was kommt raus?
    }
}