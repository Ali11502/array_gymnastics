public class MainArrayUtility {
    public static void main(String[] args) {

        int n = 50000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * n);
        }

        long start_swap = System.nanoTime();
        MyArrayUtility.MaxSort_swap(a);
        long estimate_swap = System.nanoTime() - start_swap;
        System.out.println("time taken for sorting through swap function is " + estimate_swap + " for n=" + n);
        long start_shiftright = System.nanoTime();
        MyArrayUtility.MaxSort_shiftRight(a);
        long estimate_shiftright = System.nanoTime() - start_shiftright;
        System.out.println("time taken for sorting through shift right function is " + estimate_shiftright + " for n=" + n);
    }
    /*time taken for sorting through swap function is greater than time taken by
    shift right even if data size increases, evident by using different values of n
    and time recorded for each function.  */
}
