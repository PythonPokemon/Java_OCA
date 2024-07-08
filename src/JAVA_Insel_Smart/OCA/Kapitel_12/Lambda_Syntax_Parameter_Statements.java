/*
Greeter greeter = (name) -> { String message = "Hello, " + name + "!"; System.out.println(message); };:

Lambda-Ausdruck, der einen Parameter name nimmt, eine Nachricht zusammenstellt und diese ausgibt.
 * */

package JAVA_Insel_Smart.OCA.Kapitel_12;
// Lambda_Syntax_Parameter_Statements
// Funktionales Interface für Begrüßung
@FunctionalInterface
interface Greeter {
    void greet(String name);
}

public class Lambda_Syntax_Parameter_Statements {
    public static void main(String[] args) {
        // Lambda-Ausdruck, der eine Nachricht ausgibt
        Greeter greeter = (name) -> {
            String message = "Hello, " + name + "!";
            System.out.println(message);
        };

        // Verwenden des Lambda-Ausdrucks
        greeter.greet("Alice");
    }
}
