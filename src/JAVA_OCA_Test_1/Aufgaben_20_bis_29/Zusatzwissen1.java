/*
* Variante 1 | vergleich von Literalen im String-Konstantenpool.
* String-Konstantenpool: In Java werden String-Literale im sogenannten String-Konstantenpool gespeichert.
* Wenn ein String-Literal erstellt wird, wird es in den Pool gelegt und wenn ein anderer String mit demselben Wert erstellt wird, wird derselbe Referenzwert zurückgegeben.
* Kompilierungszeit: s2 = "OCAJP" + "" wird vom Compiler als s2 = "OCAJP" optimiert.
* Das bedeutet, dass s1 und s2 auf dieselbe String-Instanz im String-Pool verweisen.
* Referenzvergleich: Da beide Variablen s1 und s2 auf dasselbe Objekt im String-Pool verweisen, ergibt s1 == s2 true.
* */
package JAVA_OCA_Test_1.Aufgaben_20_bis_29;
public class Zusatzwissen1 {
    public static void main(String[] args) {
        // Variante 1
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);       //<-- was kommt raus?
//----------------------------------------------------------------------------------------------------------------------
/*
* Variante 2 | vergleich von String-Objekte im Heap-Speicher.
* new Operator: new String("Core") und new String("CoRe") erzeugen neue String-Objekte im Heap-Speicher, unabhängig davon,
* ob diese Strings bereits im String-Pool existieren.
* Referenzvergleich: str3 und str4 sind zwei unterschiedliche Objekte im Heap, auch wenn sie denselben Textinhalt haben könnten.
* Unterschiedlicher Inhalt: In diesem Fall haben str3 und str4 sogar unterschiedliche Inhalte ("Core" vs. "CoRe").
* Selbst wenn sie denselben Inhalt hätten, wären sie unterschiedliche Objekte, was str3 == str4 zu false macht.
* */
        // Variante 2
        String str3 = new String("Core");
        String str4 = new String("CoRe");
        System.out.println(str3 == str4);   //<-- was kommt raus?
    }
}
