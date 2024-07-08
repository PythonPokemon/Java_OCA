/*
Erklärung:
------------------------------------------------------------------------------------------------------------------------
1.Import von Callable und Random:

Callable ist ein funktionales Interface, das eine Methode call hat, die eine Ausnahme werfen kann.
Random wird verwendet, um zufällig true oder false zu generieren, um die Ausnahme bedingt zu werfen.
------------------------------------------------------------------------------------------------------------------------
2.Lambda-Ausdruck:

Der Lambda-Ausdruck implementiert die Methode call des Callable-Interfaces.
Wenn new Random().nextBoolean() true zurückgibt, wird eine Ausnahme geworfen.
Andernfalls wird 42 zurückgegeben.
------------------------------------------------------------------------------------------------------------------------
3.Aufruf und Ausnahmebehandlung:

Der Lambda-Ausdruck wird über die call-Methode aufgerufen.
Der Aufruf erfolgt innerhalb eines try-catch-Blocks, um die mögliche Ausnahme zu behandeln.
------------------------------------------------------------------------------------------------------------------------
Dieses einfache Beispiel zeigt, wie man Ausnahmen in Lambda-Ausdrücken werfen und behandeln kann,
genau wie in normalen Methoden.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_12;

import java.util.concurrent.Callable;
import java.util.Random;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        // Lambda-Ausdruck, der eine Ausnahme werfen kann
        Callable<Integer> callable = () -> {
            if (new Random().nextBoolean()) {
                throw new Exception("Fehlgeschlagen");
            }
            return 42;
        };

        try {
            // Aufruf der Callable-Methode und Ausgabe des Ergebnisses
            Integer result = callable.call();
            System.out.println("Ergebnis: " + result);
        } catch (Exception e) {
            // Behandlung der geworfenen Ausnahme
            System.out.println("Ausnahme: " + e.getMessage());
        }
    }
}
