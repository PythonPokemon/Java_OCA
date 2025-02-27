package JAVA_Insel_Smart.OCA.Kapitel_3.StringBuilder_Methoden;

public class StringBuilderMethodsExample {

    public static void main(String[] args) {
        // charAt(int index)
        // Gibt das Zeichen an der angegebenen Position zurück.
        StringBuilder sb1 = new StringBuilder("Hello");
        char ch = sb1.charAt(1); // 'e'
        System.out.println("charAt(1): " + ch);

        // indexOf(String str)
        // Gibt die Position des ersten Vorkommens der angegebenen Zeichenkette zurück.
        StringBuilder sb2 = new StringBuilder("Hello");
        int indexOfStr = sb2.indexOf("ll"); // gibt die Indexposition des ersten Zeichenvorkommens auf, also 2
        System.out.println("" + indexOfStr);//

        // lastIndexOf(String str)
        // Gibt die Position des letzten Vorkommens der angegebenen Zeichenkette zurück.
        StringBuilder sb3 = new StringBuilder("Hello");
        int lastIndexOfStr = sb3.lastIndexOf("l"); // 3
        System.out.println("lastIndexOf(\"l\"): " + lastIndexOfStr);

        // length()
        // Gibt die Länge der Zeichenkette zurück.
        StringBuilder sb4 = new StringBuilder("Hello");
        int length = sb4.length(); // 5
        System.out.println("length(): " + length);

        // replace(int start, int end, String str)
        // ersetzt die Zeichen Elemente im angegebenen Bereich durch die neue Zeichenkette.
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.replace(0, 2, "AO"); // ansprache durch start & End-Index | "Hello" -> "AOllo"
        System.out.println("ändert die Zeichenkette: " + sb5);

        // substring(int start)
        // Gibt die Teilzeichenkette ab der angegebenen Position zurück.
        StringBuilder sb6 = new StringBuilder("Hello");
        String substring1 = sb6.substring(2); // "llo"
        System.out.println("Gibt eine Teilzeichenkette ab Start-Index aus: " + substring1);

        // substring(int start, int end)
        // Gibt die Teilzeichenkette vom Startindex bis zum Endindex zurück.
        StringBuilder sb7 = new StringBuilder("Hello");
        String substring2 = sb7.substring(1, 3); // "el"
        System.out.println("substring(1, 3): " + substring2);

        // toString()
        // Gibt die Zeichenkette als String zurück.
        StringBuilder sb8 = new StringBuilder("Hello");
        String toString = sb8.toString(); // "Hello"
        System.out.println("toString(): " + toString);

        // append(boolean b)
        // Fügt den booleschen Wert an das Ende der Zeichenkette an.
        StringBuilder sb9 = new StringBuilder("Hello: ");
        sb9.append(true); // "Hello: " -> "Hello true"
        System.out.println(sb9);

        // append(char c)
        // Fügt das Zeichen an das Ende der Zeichenkette an.
        StringBuilder sb10 = new StringBuilder("Hello");
        sb10.append('!'); // "Hello" -> "Hello!"
        System.out.println(sb10);

        // append(char[] str)
        // Fügt das Zeichenarray an das Ende der Zeichenkette an.
        /*
        * bedeutet das etwas das ein separates Objekt erstellt wird mit einem Char Array die Elemente beinhalten,
        * und das StringBuilder Objekt auch ein separates Objekt ist.
        * die append methode die elemente aus dem Char Objekt an die Elemente des Stringbuilder Objekts anfügt? = JA
         * */
        StringBuilder sb11 = new StringBuilder("Hello");
        sb11.append(new char[] {' ', 'J', 'a', 'v', 'a'}); // "Hello" -> "Hello Java"
        System.out.println(sb11);

        // append(char[] str, int offset, int len)
        // Fügt einen Teil des Zeichenarrays an das Ende der Zeichenkette an.
        StringBuilder sb12 = new StringBuilder("Hello");
        sb12.append(new char[] {'H', 'e', 'l', 'l', 'o'}, 1, 3); // "Hello" -> "Helloell"
        System.out.println(sb12);

        // append(CharSequence s)
        // Fügt die Zeichenfolge an das Ende der Zeichenkette an.
        StringBuilder sb13 = new StringBuilder("Hello");
        sb13.append(" World"); // "Hello" -> "Hello World"
        System.out.println(sb13);

        // append(CharSequence s, int start, int end)
        // Fügt einen Teil der Zeichenfolge an das Ende der Zeichenkette an.
        StringBuilder sb14 = new StringBuilder("Hello");
        sb14.append("Programming", 0, 3); // "Hello" -> "HelloPro"
        System.out.println(sb14);

        // append(double d)
        // Fügt die Gleitkommazahl an das Ende der Zeichenkette an.
        StringBuilder sb15 = new StringBuilder("Hello ");
        sb15.append(1.23); // "Hello" -> "Hello1.23"
        System.out.println(sb15);

        // append(float f)
        // Fügt die Fließkommazahl an das Ende der Zeichenkette an.
        StringBuilder sb16 = new StringBuilder("Hello");
        sb16.append(4.56f); // "Hello" -> "Hello4.56"
        System.out.println(sb16);

        // append(int i)
        // Fügt die ganze Zahl an das Ende der Zeichenkette an.
        StringBuilder sb17 = new StringBuilder("Hello ");
        sb17.append(789); // "Hello" -> "Hello789"
        System.out.println(sb17);

        // append(long lng)
        // Fügt die lange ganze Zahl an das Ende der Zeichenkette an.
        StringBuilder sb18 = new StringBuilder("Hello ");
        sb18.append(123456789L); // "Hello" -> "Hello123456789"
        System.out.println(sb18);

        // append(Object obj)
        // Fügt die Zeichenkette der Objekt-Darstellung an das Ende der Zeichenkette an.
        //hier wird einfach am Ende der Elemente eines objekts noch die speicher adresse eines neuen Objektes eingefügt
        StringBuilder sb19 = new StringBuilder("Hello");
        sb19.append(new Object()); // Ausgabe variiert, da Object's toString() verwendet wird
        System.out.println( sb19);

        // append(String str)
        // Fügt die Zeichenkette an das Ende der Zeichenkette an.
        StringBuilder sb20 = new StringBuilder("Hello");
        sb20.append("Test"); // "Hello" -> "HelloTest"
        System.out.println(sb20);

        // delete(int start, int end)
        // Löscht die Zeichen im angegebenen Bereich.
        StringBuilder sb21 = new StringBuilder("Hello Java");
        sb21.delete(6, 10); // "Hello Java" -> "Hello "
        System.out.println(sb21);

        // deleteCharAt(int index)
        // Löscht das Zeichen an der angegebenen Position.
        StringBuilder sb22 = new StringBuilder("Hello");
        sb22.deleteCharAt(0); // "Hello" -> "ello"
        System.out.println(sb22);

        // insert(int offset, boolean b)
        // Fügt den booleschen Wert an der angegebenen Position ein.
        StringBuilder sb23 = new StringBuilder("Hello");
        sb23.insert(1, false); // "Hello" -> "H'false'ello"
        System.out.println(sb23);

        // insert(int offset, char c)
        // Fügt das Zeichen an der angegebenen Position ein.
        // in diesem fall Index 1 was 'e' wäre, doch stattdessen wird 'e'
        // und der rest einfach nach hinten verschoben in der Indexierung
        StringBuilder sb24 = new StringBuilder("Hello");
        sb24.insert(1, 'X'); // "Hello" -> "H'X'ello"
        System.out.println(sb24);

        // insert(int offset, char[] str)
        // Fügt das Zeichenarray an der angegebenen Position ein.
        // in diesem fall Index 1 was 'e' wäre, doch stattdessen wird 'e'
        // und der rest einfach nach hinten verschoben in der Indexierung
        StringBuilder sb25 = new StringBuilder("Hello");
        sb25.insert(1, new char[] {'A', 'B', 'C'}); // "Hello" -> "HABCello"
        System.out.println(sb25);

        // insert(int offset, CharSequence s)
        // Fügt die Zeichenfolge an der angegebenen Position ein.
        StringBuilder sb26 = new StringBuilder("Hello");
        sb26.insert(1, "Insert"); // "Hello" -> "H'Insert'ello"
        System.out.println(sb26);

        // insert(int dstOffset, CharSequence s, int start, int end)
        // Fügt einen Teil der Zeichenfolge an der angegebenen Position ein.
        // Start Index 1
        StringBuilder sb27 = new StringBuilder("Hello");
        sb27.insert(1, "0123456789", 1, 4); // "Hello" -> "H123ello"
        System.out.println("insert(1, \"0123456789\", 1, 4): " + sb27);

        // insert(int offset, double d)
        // Fügt die Gleitkommazahl an der angegebenen Position ein.
        StringBuilder sb28 = new StringBuilder("Hello");
        sb28.insert(1, 2.71); // "Hello" -> "H2.71ello"
        System.out.println(sb28);

        // insert(int offset, float f)
        // Fügt die Fließkommazahl an der angegebenen Position ein.
        StringBuilder sb29 = new StringBuilder("Hello");
        sb29.insert(1, 3.14f); // "Hello" -> "H3.14ello"
        System.out.println(sb29);

        // insert(int offset, int i)
        // Fügt die ganze Zahl an der angegebenen Position ein.
        StringBuilder sb30 = new StringBuilder("Hello");
        sb30.insert(1, 42); // "Hello" -> "H42ello"
        System.out.println(sb30);

        // insert(int offset, long l)
        // Fügt die lange ganze Zahl an der angegebenen Position ein.
        StringBuilder sb31 = new StringBuilder("Hello");
        sb31.insert(1, 9876543210L); // "Hello" -> "H'9876543210'ello"
        System.out.println(sb31);

        // insert(int offset, Object obj)
        // Fügt die Zeichenkette der Objekt-Darstellung an der angegebenen Position ein.
        StringBuilder sb32 = new StringBuilder("Hello");
        sb32.insert(1, new Object()); // Ausgabe variiert, da Object's toString() verwendet wird
        System.out.println(sb32);

        // insert(int offset, String str)
        // Fügt die Zeichenkette an der angegebenen Position ein.
        StringBuilder sb33 = new StringBuilder("Hello");
        sb33.insert(1, "World"); // "Hello" -> "H'World'ello"
        System.out.println(sb33);

        // reverse()
        // Kehrt die Zeichenfolge um.
        StringBuilder sb34 = new StringBuilder("Hello");
        sb34.reverse(); // "Hello" -> "olleH"
        System.out.println(sb34);

        // setCharAt(int index, char ch)
        // Setzt das Zeichen an der angegebenen Position.
        StringBuilder sb35 = new StringBuilder("Hello");
        sb35.setCharAt(0, 'A'); // "Hello" -> "'A'ello"
        System.out.println(sb35);

        // setLength(int newLength)
        // Kürzt oder füllt die Zeichenfolge auf die neue Länge.
        StringBuilder sb36 = new StringBuilder("Hello");
        sb36.setLength(10); // "Hello" -> "Hello     "
        System.out.println(sb36);
    }
}