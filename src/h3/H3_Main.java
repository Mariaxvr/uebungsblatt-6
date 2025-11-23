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
        System.out.println("Gleicher Inhalt: " + compareArraysVal(a,f));
    }
    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length;i++) {
            int cellVal = a[i];
            int aVal = 0;
            int bVal = 0;

            for (int j = 0; j < a.length;j++) {
                if (a[j] == cellVal) {
                    aVal++;
                }
            }
            for (int k = 0; k < b.length;k++) {
                if (b[k] == cellVal) {
                    bVal++;
                }
            }
            if (aVal != bVal) {
                return false;
            }
        }
        return true;
    }
}
