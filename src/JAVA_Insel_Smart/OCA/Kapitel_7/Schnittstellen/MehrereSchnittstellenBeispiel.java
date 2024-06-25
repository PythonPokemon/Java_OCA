/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Definition der Schnittstellen:

Schnittstelle1 deklariert eine Methode methode1().
Schnittstelle2 deklariert eine Methode methode2().
------------------------------------------------------------------------------------------------------------------------
Implementierung der Schnittstellen:

Implementierung ist eine Klasse, die sowohl Schnittstelle1 als auch Schnittstelle2 implementiert.
Die Klasse Implementierung muss beide Methoden methode1() und methode2() definieren.
------------------------------------------------------------------------------------------------------------------------
Instanziierung und Methodenaufrufe:

Eine Instanz der Klasse Implementierung wird erstellt.
Die Methoden methode1() und methode2() werden aufgerufen, was die Implementierungen in der Klasse Implementierung ausführt.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
------------------------------------------------------------------------------------------------------------------------
Deklaration von Schnittstellen:

Schnittstellen werden mit dem Schlüsselwort interface deklariert.
Alle Methoden in einer Schnittstelle sind implizit public und abstract.
------------------------------------------------------------------------------------------------------------------------
Implementierung von mehreren Schnittstellen:

Eine Klasse kann mehrere Schnittstellen implementieren. Dies wird durch Kommas getrennt angegeben.
Die Klasse muss alle Methoden aus allen implementierten Schnittstellen definieren.
------------------------------------------------------------------------------------------------------------------------
Verwendung der @Override-Annotation:

Verwenden Sie die @Override-Annotation, wenn Sie Methoden einer Schnittstelle implementieren.
Dies hilft sicherzustellen, dass die Methode korrekt implementiert wird und keine Tippfehler vorliegen.
------------------------------------------------------------------------------------------------------------------------
Kombination von Schnittstellen:

Eine Schnittstelle kann von einer oder mehreren anderen Schnittstellen erben,
um eine erweiterte Schnittstelle zu erstellen.
Dies ermöglicht es, Schnittstellen zu kombinieren und zu erweitern.
* */
package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der ersten Schnittstelle
interface Schnittstelle1a {
    void methode1();
}

// Definition der zweiten Schnittstelle
interface Schnittstelle2a {
    void methode2();
}

// Klasse, die beide Schnittstellen implementiert
class Implementierung1A implements Schnittstelle1a, Schnittstelle2a {
    @Override
    public void methode1() {
        System.out.println("Implementierung der Methode1 in Implementierung");
    }

    @Override
    public void methode2() {
        System.out.println("Implementierung der Methode2 in Implementierung");
    }
}

public class MehrereSchnittstellenBeispiel {
    public static void main(String[] args) {
        Implementierung1A obj = new Implementierung1A();
        obj.methode1();  // Aufruf der Methode1
        obj.methode2();  // Aufruf der Methode2
    }
}
