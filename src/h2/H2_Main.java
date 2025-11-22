package h2;

public class H2_Main {
    public static void main(String[] args) {

        int[] x = {1,2,3,4};
        int[] y = {1,2,3,4};

        comparearrays(x,y);
        System.out.println("Gleich: " + comparearrays(x,y));
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
