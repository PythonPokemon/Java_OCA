package JAVA_Insel_Smart.Kapitel_3;

public class FileObjekt {
    public static void main(String[] args) {
        long size = new java.io.File( "file.txt" ).length();
        System.out.println(size);
    }
}
