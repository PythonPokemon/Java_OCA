package TestAufgaben;

public class LZK6 {
    public static void main(String[] args) {
        int value = 33;
        if (value >= 0) {
            if (value != 0)
                System.out.println("The ");
            else
                System.out.println("quick ");
            if (value < 10)
                System.out.println("brown ");
            else if (value > 30)
                System.out.println("fox ");
            else if (value < 50)
                System.out.println("jumps ");
            else if (value < 10)
                System.out.println("over ");
            else
                System.out.println("The ");
            if (value > 10)
                System.out.println("lazy ");
        } else {
            System.out.println("dog ");
        }
        System.out.println("...");
    }
}
