/*
Verbesserung der Parallelisierung und der Performance
------------------------------------------------------------------------------------------------------------------------
Lambdas und Streams arbeiten gut zusammen, um parallelisierte Datenverarbeitung zu unterstützen.
Dies kann zu Performance-Verbesserungen führen, indem Aufgaben parallel auf mehreren Kernen ausgeführt werden.
------------------------------------------------------------------------------------------------------------------------
Die Methode parallelStream() in Java ermöglicht es, Streams parallel zu verarbeiten.
Dies bedeutet, dass die Operationen auf den Elementen des Streams gleichzeitig
auf mehreren Threads ausgeführt werden können, anstatt nacheinander in einem einzelnen Thread.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_12;

import java.util.Arrays;
import java.util.List;

public class Lambda_parallelStream {
    public static void main(String[] args) {

        List<Integer> nummern = Arrays.asList(1, 2, 3, 4, 5);
        int summe = nummern.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Summer der geraden Zahlen: " + summe);

    }
}
