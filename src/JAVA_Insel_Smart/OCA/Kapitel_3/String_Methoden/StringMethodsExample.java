package JAVA_Insel_Smart.OCA.Kapitel_3.String_Methoden;

public class StringMethodsExample {

    public static void main(String[] args) {
        // charAt(int index)
        // Gibt das Zeichen an der angegebenen Position zurück.
        String str1 = "Hello";
        char ch = str1.charAt(1); // 'e'
        System.out.println("charAt(1): " + ch);

        // compareTo(String anotherString)
        // Vergleicht die Zeichenkette lexikographisch mit einer anderen Zeichenkette.
        String str2 = "Hello";
        int compareToResult = str2.compareTo("World"); // Negative value
        System.out.println("compareTo(\"World\"): " + compareToResult);

        // concat(String str)
        // Verkettet die angegebene Zeichenkette mit der aktuellen Zeichenkette.
        String str3 = "Hello";
        String concatResult = str3.concat(" World"); // "Hello World"
        System.out.println("concat(\" World\"): " + concatResult);

        // contains(CharSequence s)
        // Prüft, ob die Zeichenkette die angegebene Zeichenfolge enthält.
        String str4 = "Hello";
        boolean containsResult = str4.contains("ell"); // true
        System.out.println("contains(\"ell\"): " + containsResult);

        // endsWith(String suffix)
        // Prüft, ob die Zeichenkette mit der angegebenen Zeichenfolge endet.
        String str5 = "Hello";
        boolean endsWithResult = str5.endsWith("lo"); // true
        System.out.println("endsWith(\"lo\"): " + endsWithResult);

        // equals(Object anObject)
        // Vergleicht die Zeichenkette auf Gleichheit mit einem anderen Objekt.
        String str6 = "Hello";
        boolean equalsResult = str6.equals("Hello"); // true
        System.out.println("equals(\"Hello\"): " + equalsResult);

        // equalsIgnoreCase(String anotherString)
        // Vergleicht die Zeichenkette auf Gleichheit mit einer anderen Zeichenkette, ignoriert Groß-/Kleinschreibung.
        String str7 = "Hello";
        boolean equalsIgnoreCaseResult = str7.equalsIgnoreCase("hello"); // true
        System.out.println("equalsIgnoreCase(\"hello\"): " + equalsIgnoreCaseResult);

        // indexOf(int ch)
        // Gibt die Position des ersten Vorkommens des angegebenen Zeichens zurück.
        String str8 = "Hello";
        int indexOfChar = str8.indexOf('l'); // 2
        System.out.println("indexOf('l'): " + indexOfChar);

        // indexOf(String str)
        // Gibt die Position des ersten Vorkommens der angegebenen Zeichenkette zurück.
        String str9 = "Hello";
        int indexOfStr = str9.indexOf("lo"); // 3
        System.out.println("indexOf(\"lo\"): " + indexOfStr);

        // isEmpty()
        // Prüft, ob die Zeichenkette leer ist.
        String str10 = "Hello";
        boolean isEmptyResult = str10.isEmpty(); // false
        System.out.println("isEmpty(): " + isEmptyResult);

        // lastIndexOf(int ch)
        // Gibt die Position des letzten Vorkommens des angegebenen Zeichens zurück.
        String str11 = "Hello";
        int lastIndexOfChar = str11.lastIndexOf('l'); // 3
        System.out.println("lastIndexOf('l'): " + lastIndexOfChar);

        // lastIndexOf(String str)
        // Gibt die Position des letzten Vorkommens der angegebenen Zeichenkette zurück.
        String str12 = "Hello";
        int lastIndexOfStr = str12.lastIndexOf("lo"); // 3
        System.out.println("lastIndexOf(\"lo\"): " + lastIndexOfStr);

        // length()
        // Gibt die Länge der Zeichenkette zurück.
        String str13 = "Hello";
        int lengthResult = str13.length(); // 5
        System.out.println("length(): " + lengthResult);

        // replace(char oldChar, char newChar)
        // Ersetzt alle Vorkommen eines Zeichens durch ein neues Zeichen.
        String str14 = "Hello";
        String replaceCharResult = str14.replace('l', 'p'); // "Heppo"
        System.out.println("replace('l', 'p'): " + replaceCharResult);

        // replace(CharSequence target, CharSequence replacement)
        // Ersetzt alle Vorkommen einer Zeichenfolge durch eine neue Zeichenfolge.
        String str15 = "Hello";
        String replaceSequenceResult = str15.replace("ll", "yy"); // "Heyyo"
        System.out.println("replace(\"ll\", \"yy\"): " + replaceSequenceResult);

        // replaceAll(String regex, String replacement)
        // Ersetzt alle Vorkommen eines regulären Ausdrucks durch eine neue Zeichenfolge.
        String str16 = "Hello123";
        String replaceAllResult = str16.replaceAll("\\d", ""); // "Hello"
        System.out.println("replaceAll(\"\\d\", \"\"): " + replaceAllResult);

        // replaceFirst(String regex, String replacement)
        // Ersetzt das erste Vorkommen eines regulären Ausdrucks durch eine neue Zeichenfolge.
        String str17 = "Hello123";
        String replaceFirstResult = str17.replaceFirst("\\d", ""); // "Hello23"
        System.out.println("replaceFirst(\"\\d\", \"\"): " + replaceFirstResult);

        // split(String regex)
        // Teilt die Zeichenkette anhand des angegebenen regulären Ausdrucks.
        String str18 = "one,two,three";
        String[] splitResult = str18.split(","); // ["one", "two", "three"]
        System.out.println("split(\",\"): " + java.util.Arrays.toString(splitResult));

        // split(String regex, int limit)
        // Teilt die Zeichenkette anhand des angegebenen regulären Ausdrucks, begrenzt auf die angegebene Anzahl von Teilen.
        String str19 = "one,two,three";
        String[] splitLimitResult = str19.split(",", 2); // ["one", "two,three"]
        System.out.println("split(\",\", 2): " + java.util.Arrays.toString(splitLimitResult));

        // startsWith(String prefix)
        // Prüft, ob die Zeichenkette mit der angegebenen Zeichenfolge beginnt.
        String str20 = "Hello";
        boolean startsWithResult = str20.startsWith("He"); // true
        System.out.println("startsWith(\"He\"): " + startsWithResult);

        // substring(int beginIndex)
        // Gibt die Teilzeichenkette ab der angegebenen Position zurück.
        String str21 = "Hello";
        String substring1Result = str21.substring(2); // "llo"
        System.out.println("substring(2): " + substring1Result);

        // substring(int beginIndex, int endIndex)
        // Gibt die Teilzeichenkette vom Startindex bis zum Endindex zurück.
        String str22 = "Hello";
        String substring2Result = str22.substring(1, 3); // "el"
        System.out.println("substring(1, 3): " + substring2Result);

        // toCharArray()
        // Wandelt die Zeichenkette in ein Zeichenarray um.
        String str23 = "Hello";
        char[] toCharArrayResult = str23.toCharArray(); // ['H', 'e', 'l', 'l', 'o']
        System.out.println("toCharArray(): " + java.util.Arrays.toString(toCharArrayResult));

        // toLowerCase()
        // Wandelt alle Zeichen der Zeichenkette in Kleinbuchstaben um.
        String str24 = "Hello";
        String toLowerCaseResult = str24.toLowerCase(); // "hello"
        System.out.println("toLowerCase(): " + toLowerCaseResult);

        // toUpperCase()
        // Wandelt alle Zeichen der Zeichenkette in Großbuchstaben um.
        String str25 = "Hello";
        String toUpperCaseResult = str25.toUpperCase(); // "HELLO"
        System.out.println("toUpperCase(): " + toUpperCaseResult);

        // trim()
        // Entfernt führende und nachfolgende Leerzeichen aus der Zeichenkette.
        String str26 = "   Hello   ";
        String trimResult = str26.trim(); // "Hello"
        System.out.println("trim(): " + trimResult);

        // toString()
        // Gibt die Zeichenkette zurück.
        String str27 = "Hello";
        String toStringResult = str27.toString(); // "Hello"
        System.out.println("toString(): " + toStringResult);
    }
}
