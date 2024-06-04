/*
Currently above code causes compilation error.

Which of the options can successfully print TEXT,25 on to the console?

Replace /*INSERT-1/ with:

        this(type);

Replace /*INSERT-/ with:

        this.type = type;

Replace /*INSERT-1/ with:

        super.type = type;

Replace /*INSERT-2/ with:

        this(type);

Replace /*INSERT-1/ with:

        super.type = type;

Replace /*INSERT-2/ with:

        super(type);

Correct answer
Replace /*INSERT-1/ with:

        this.type = type;

Replace /*INSERT-2/ with:

        this(type);

None of the other options

 * */
package JAVA_OCA_Test_4.Aufgaben_60_bis_69;

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
}

class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages
        this.type = type; //<--- änderung
        /*INSERT-1*/
    }

    Word(int pages, String type) {
        this(type); //<--- änderung
        /*INSERT-2*/
        super.pages = pages;
    }
}

public class test69 {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(obj.type + "," + obj.pages);
    }
}
