public class Test {
    public static void main(String args[]) {
    }

    void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            JILL:System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
}