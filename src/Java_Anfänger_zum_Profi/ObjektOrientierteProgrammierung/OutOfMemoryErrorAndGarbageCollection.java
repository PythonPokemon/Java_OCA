package Java_Anfänger_zum_Profi.ObjektOrientierteProgrammierung;

/**
 * Lernziel:
 * - Heap
 * - OutOfMemoryError
 * - Garbage Collector = automatische speicher Bereinigung
 * = dient dazu das nicht mehr gebrauchte referenz Objekte automatisch gelöscht werden.
 * = damit der Virtualen Maschine als Speicher wieder zur verfügung steht
 * alle Objekte die angelegt werden, leben auf dem Heap, der jedoch hat eine beschränkte größe
 */
public class OutOfMemoryErrorAndGarbageCollection {
    public static void main(String[] args) {

    java.util.Stack stack = new java.util.Stack();  // einfache Datenstruktur
//    while (true){
////        stack.push(new java.awt.Point());
//        new java.awt.Point();
//    }
    java.awt.Point p = new java.awt.Point();    // A nicht mehr benötigt, wird also gelöscht
    p = new java.awt.Point();                   // B nicht mehr benötigt, wird also gelöscht
    p = null;

    }
}
