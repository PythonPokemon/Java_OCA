/*
Hier ist T ein Typ-Parameter.
Du kannst ihn durch jeden beliebigen Datentyp ersetzen, wenn du eine Instanz der Klasse erstellst.
* */

package JAVA_Insel_Smart.OCA.Kapitel_11;

 class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}


public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics");
        System.out.println(stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent());
    }
}
