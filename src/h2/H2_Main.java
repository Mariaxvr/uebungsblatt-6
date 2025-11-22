package h2;

public class H2_Main {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,2,4};
        int[] c = {1,3,2};
        int[] d = {1,2};
        int[] e = {1,2,3};


        comparearrays(a,e); // unnötig
        System.out.println("Gleich: " + comparearrays(e,a));
    }

    public static boolean comparearrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
