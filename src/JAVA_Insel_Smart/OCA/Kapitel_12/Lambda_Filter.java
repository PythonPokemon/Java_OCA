package JAVA_Insel_Smart.OCA.Kapitel_12;
// Lambda_Filter
import java.util.Arrays;

public class Lambda_Filter {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry", "Apricot"};

        // Filtern des Arrays für Elemente, die mit 'A' beginnen
        Arrays.stream(array)
                .filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.println(s));
    }
}
