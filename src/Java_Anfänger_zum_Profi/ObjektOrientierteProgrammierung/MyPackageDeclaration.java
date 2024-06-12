package Java_Anfänger_zum_Profi.ObjektOrientierteProgrammierung;    // das sagt aus das die datei: MyPackageDeclaration im packet:

import Java_Anfänger_zum_Profi.Verweise.util.Line;   // importiert die anweisung aus der klasse Line, aus dem packet und führt sie aus

/*
 * Lernziel:
 * - eigene Pakete deklarieren
 * - Zusammenhang Paket und Verzeichnis
 * - die datei liegt im Ordner Java_Anfänger_zum_Profi.Verweise.util | namens = Line
 *
 * - man kann eine klasse per drag and drop aus dem verzeichnis in ein packet einsetzten

 * */
public class MyPackageDeclaration {
    public static void main(String[] args) {
        Line.line();
    }
}