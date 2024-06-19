package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Sinus_Cosinus_NumberFormatException {
    public static void main(String[] args) {
        try {
            String s = javax.swing.JOptionPane.showInputDialog("Bitte Zahl eingeben");
            double value = Double.parseDouble(s);
            System.out.println("Sinus: " + Math.sin(value));
            System.out.println("Kosinus: " + Math.cos(value));
        } catch (NumberFormatException e) {
            String info = javax.swing.JOptionPane.showInputDialog("Ungültige Eingabe! Bitte gib eine gültige Zahl ein.");
            double value = Double.parseDouble(info);
            System.out.println("Sinus: " + Math.sin(value));
            System.out.println("Kosinus: " + Math.cos(value));
        }
    }
}
