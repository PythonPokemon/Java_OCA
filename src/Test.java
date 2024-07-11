public class Test {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };

        int[] b = { 2, 3, 1, 0 };

        System.out.println( a[ (a = b)[2] ] ); // also wenn man den index hier im ausdruck verändert


       // System.out.println( a[ b[1] ] );
       // System.out.println( a[ 3 ] );

//        System.out.println(b[0]);
//        System.out.println(b[1]);


    }
}