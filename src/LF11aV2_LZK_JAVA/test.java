package LF11aV2_LZK_JAVA;

public class test {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8};
        int arr2[] = {1, 3, 5, 7, 9};
        arr2 = arr1;
        for (int a : arr2) {
            System.out.println(a + " ");
        }
    }
}




