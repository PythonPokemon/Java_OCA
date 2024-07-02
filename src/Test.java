//.

public class Test {
    private Object o;

    void doSomething(Object s) {
        o = s;
    }

    public static void main(String args[]) {
        Object obj = new Object(); // 1
        Test tc = new Test(); //2
        tc.doSomething(obj); //3
        obj = new Object(); //4
        obj = null; //5
        tc.doSomething(obj); //6
    }
}
