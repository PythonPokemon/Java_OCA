package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringBuilder_Daten_anhängen {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Number ");
        sb.append(42);
        sb.append(" ZahlenAnhang " + 1 + " Pi " + 3.14);


        System.out.println(sb);
    }
}
