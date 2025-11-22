package h3;

public class H3_Main {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,2,4};
        int[] c = {1,3,2};
        int[] d = {1,2};
        int[] e = {1,2,3};
        int[] f = {1,1,2};

        //compareArraysVal(a,b);
        System.out.println("Gleicher Inhalt: " + compareArraysVal(a,b));
    }
    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] == b[j]) {
                b[j] = b[j] + 1;
            }
        }
        return true;
    }
}
