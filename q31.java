import java.util.Arrays;
public class q31 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};

        int[] C = mergeArrays(A, B);
        System.out.println("Merged array: " + Arrays.toString(C));
    }
    public static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        int[] C = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < m) {
            C[k] = B[j];
            j++;
            k++;
        }
        return C;
    }
}
