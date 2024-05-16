package JAVA_OCA_Test_1.Aufgaben_10_bis_19;


public class test17 {
    public static void main(String[] args) {
        System.out.println("Fill in the blanks for the definition of java.lang.Error class:");
        System.out.println("public class java.lang.Error extends___________{...}");

        boolean Throwable = true;           //<-- Wurffähig
        boolean RuntimeExcetion = false;    //<-- RuntimeException
        boolean Excetion = false;           //<-- Ausnahme

        System.out.println(Throwable);
        System.out.println(RuntimeExcetion);
        System.out.println(Excetion);
    }
}

//public class java.lang.Error extends {__________}

/*
* Error:
* Repräsentiert schwerwiegende Fehler, die normalerweise außerhalb der Kontrolle des Programms liegen und auf Probleme hinweisen,
* die dazu führen können, dass das Programm nicht mehr ordnungsgemäß ausgeführt werden kann.
* Beispiele hierfür sind OutOfMemoryError, StackOverflowError, etc.
*
Exception:
* Repräsentiert Ausnahmen, die während der Ausführung des Programms auftreten können, aber in der Regel behandelbar sind.
* Ausnahmen können entweder von der JVM oder vom Programm selbst ausgelöst werden und können behandelt oder abgefangen werden, um das Programm stabil und robust zu halten.
* Beide, Error und Exception, sind direkt oder indirekt von der Klasse Throwable abgeleitet, was bedeutet, dass sie alle Eigenschaften und Methoden von Throwable erben.
* Dadurch können sie mit den gleichen Mechanismen behandelt werden,
* z. B. mit Try-Catch-Blöcken oder der Weitergabe von Ausnahmen an Aufrufer.*/