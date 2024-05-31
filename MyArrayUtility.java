public class MyArrayUtility {
    public static void swap(int[] A, int i, int j) {
        int temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void shiftRight(int[] A, int i, int j) {
        for (int i1 = j; i1 > i; i1--) {
            A[i1] = A[i1 - 1];

        }
    }

    public static void MaxSort_shiftRight(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < A.length; j++) {
                if (A[j] >= max) {
                    max = A[j];
                    index = j;
                }
            }
            shiftRight(A, i, index);
            A[i] = max;
        }
    }

    public static void MaxSort_swap(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < A.length; j++) {
                if (A[j] >= max) {
                    max = A[j];
                    index = j;
                }
            }
            swap(A, i, index);
        }
    }
}
