class Test {
    public int a;
    public int b;

// Initialsierung : aller Fields
    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public Test() {
        this(10, 10); // a und b werden beide mit 10 initialisiert
    }

}

public class TestClass {
    public static void main(String[] args) {
    Test aRef = new Test();


        System.out.println(aRef.a);
        System.out.println(aRef.b);


    }
}