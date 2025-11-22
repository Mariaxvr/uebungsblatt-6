package h1;

import java.util.Arrays;

public class H1_Main {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {4,3,2,1};

        isMirrorArray(a,b);
        System.out.println("Gespiegelt: " + isMirrorArray(a,b));
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
