package TestAufgaben;

public class LZK3 {
    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc", "dd"};

        for (
                String s : table) {
            if ("bb".equals(s)) {
                continue;

            }
            System.out.println(s);
            if ("cc".equals(s)) {
                break;
            }
        }
    }
}