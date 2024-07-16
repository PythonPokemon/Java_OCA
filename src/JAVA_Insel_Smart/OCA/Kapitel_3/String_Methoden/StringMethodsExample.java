package JAVA_Insel_Smart.OCA.Kapitel_3.String_Methoden;

public class StringMethodsExample {

    public static void main(String[] args) {
        // charAt(int index)
        String str = "Hello";
        char ch = str.charAt(1); // 'e'
        System.out.println("charAt(1): " + ch);

        // compareTo(String anotherString)
        int cmp = str.compareTo("World"); // Negative value, because "Hello" < "World"
        System.out.println("compareTo(\"World\"): " + cmp);

        // concat(String str)
        String concatStr = str.concat(" World"); // "Hello World"
        System.out.println("concat(\" World\"): " + concatStr);

        // contains(CharSequence s)
        boolean contains = str.contains("ell"); // true
        System.out.println("contains(\"ell\"): " + contains);

        // endsWith(String suffix)
        boolean endsWith = str.endsWith("lo"); // true
        System.out.println("endsWith(\"lo\"): " + endsWith);

        // equals(Object anObject)
        boolean equals = str.equals("Hello"); // true
        System.out.println("equals(\"Hello\"): " + equals);

        // equalsIgnoreCase(String anotherString)
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello"); // true
        System.out.println("equalsIgnoreCase(\"hello\"): " + equalsIgnoreCase);

        // indexOf(int ch)
        int indexOfCh = str.indexOf('l'); // 2
        System.out.println("indexOf('l'): " + indexOfCh);

        // indexOf(String str)
        int indexOfStr = str.indexOf("lo"); // 3
        System.out.println("indexOf(\"lo\"): " + indexOfStr);

        // isEmpty()
        boolean isEmpty = str.isEmpty(); // false
        System.out.println("isEmpty(): " + isEmpty);

        // lastIndexOf(int ch)
        int lastIndexOfCh = str.lastIndexOf('l'); // 3
        System.out.println("lastIndexOf('l'): " + lastIndexOfCh);

        // lastIndexOf(String str)
        int lastIndexOfStr = str.lastIndexOf("lo"); // 3
        System.out.println("lastIndexOf(\"lo\"): " + lastIndexOfStr);

        // length()
        int length = str.length(); // 5
        System.out.println("length(): " + length);

        // replace(char oldChar, char newChar)
        String replaceChar = str.replace('l', 'p'); // "Heppo"
        System.out.println("replace('l', 'p'): " + replaceChar);

        // replace(CharSequence target, CharSequence replacement)
        String replaceSequence = str.replace("ll", "yy"); // "Heyyo"
        System.out.println("replace(\"ll\", \"yy\"): " + replaceSequence);

        // replaceAll(String regex, String replacement)
        String replaceAll = str.replaceAll("l", "p"); // "Heppo"
        System.out.println("replaceAll(\"l\", \"p\"): " + replaceAll);

        // replaceFirst(String regex, String replacement)
        String replaceFirst = str.replaceFirst("l", "p"); // "Heplo"
        System.out.println("replaceFirst(\"l\", \"p\"): " + replaceFirst);

        // split(String regex)
        String[] splitArray = str.split("l"); // ["He", "", "o"]
        System.out.println("split(\"l\"): " + java.util.Arrays.toString(splitArray));

        // split(String regex, int limit)
        String[] splitArrayLimit = str.split("l", 2); // ["He", "lo"]
        System.out.println("split(\"l\", 2): " + java.util.Arrays.toString(splitArrayLimit));

        // startsWith(String prefix)
        boolean startsWith = str.startsWith("He"); // true
        System.out.println("startsWith(\"He\"): " + startsWith);

        // substring(int beginIndex)
        String substring1 = str.substring(2); // "llo"
        System.out.println("substring(2): " + substring1);

        // substring(int beginIndex, int endIndex)
        String substring2 = str.substring(1, 4); // "ell"
        System.out.println("substring(1, 4): " + substring2);

        // toCharArray()
        char[] charArray = str.toCharArray(); // ['H', 'e', 'l', 'l', 'o']
        System.out.println("toCharArray(): " + java.util.Arrays.toString(charArray));

        // toLowerCase()
        String lowerCase = str.toLowerCase(); // "hello"
        System.out.println("toLowerCase(): " + lowerCase);

        // toUpperCase()
        String upperCase = str.toUpperCase(); // "HELLO"
        System.out.println("toUpperCase(): " + upperCase);

        // trim()
        String strWithSpaces = "   Hello   ";
        String trimmed = strWithSpaces.trim(); // "Hello"
        System.out.println("trim(): " + trimmed);

        // toString()
        String toString = str.toString(); // "Hello"
        System.out.println("toString(): " + toString);
    }
}
