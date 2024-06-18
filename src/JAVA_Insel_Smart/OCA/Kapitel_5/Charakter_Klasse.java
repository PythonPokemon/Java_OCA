/*
Die Character-Klasse
5.2.1 Ist das so?
Die Character-Klasse bietet Methoden zum Testen von Zeichen.
Diese Methoden beginnen in der Regel mit is und liefern einen boolean-Wert zurück.
------------------------------------------------------------------------------------------------------------------------
Character.isDigit('0'): true
Character.isDigit('-'): false
-
Character.isLetter('ß'): true
Character.isLetter('0'): false
-
Character.isWhitespace(' '): true
Character.isWhitespace('-'): false
-
Character.isUpperCase('A'): true
Character.isLowerCase('a'): true
-
Character.isTitleCase('ǅ'): true
-
Character.toLowerCase('A'): a
Character.toUpperCase('a'): A
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Charakter_Klasse {
    public static void main(String[] args) {
        // Testen von Ziffern
        char digit = '0';
        char nonDigit = '-';
        System.out.println("Character.isDigit('" + digit + "'): " + Character.isDigit(digit)); // true
        System.out.println("Character.isDigit('" + nonDigit + "'): " + Character.isDigit(nonDigit)); // false

        // Testen von Buchstaben
        char letter = 'ß';
        char nonLetter = '0';
        System.out.println("Character.isLetter('" + letter + "'): " + Character.isLetter(letter)); // true
        System.out.println("Character.isLetter('" + nonLetter + "'): " + Character.isLetter(nonLetter)); // false

        // Testen von Leerzeichen
        char whitespace = ' ';
        char nonWhitespace = '-';
        System.out.println("Character.isWhitespace('" + whitespace + "'): " + Character.isWhitespace(whitespace)); // true
        System.out.println("Character.isWhitespace('" + nonWhitespace + "'): " + Character.isWhitespace(nonWhitespace)); // false

        // Weitere nützliche Methoden der Character-Klasse
        char upperCaseLetter = 'A';
        char lowerCaseLetter = 'a';
        char titleCaseLetter = '\u01C5'; // Unicode-Zeichen ǅ (dz mit Hatschek)
        System.out.println("Character.isUpperCase('" + upperCaseLetter + "'): " + Character.isUpperCase(upperCaseLetter)); // true
        System.out.println("Character.isLowerCase('" + lowerCaseLetter + "'): " + Character.isLowerCase(lowerCaseLetter)); // true
        System.out.println("Character.isTitleCase('" + titleCaseLetter + "'): " + Character.isTitleCase(titleCaseLetter)); // true

        // Konvertieren von Zeichen
        char lowerCased = Character.toLowerCase(upperCaseLetter);
        char upperCased = Character.toUpperCase(lowerCaseLetter);
        System.out.println("Character.toLowerCase('" + upperCaseLetter + "'): " + lowerCased); // 'a'
        System.out.println("Character.toUpperCase('" + lowerCaseLetter + "'): " + upperCased); // 'A'
    }
}
