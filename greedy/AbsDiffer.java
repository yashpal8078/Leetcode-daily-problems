
import java.util.Arrays;

public class AbsDiffer {
    

    public static void main(String[] args) {
        
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;
        int minDiff = Integer.MAX_VALUE;
        while (i < A.length && j < B.length) {
            int diff = Math.abs(A[i] - B[j]);
            minDiff = Math.min(minDiff, diff);

            if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Minimum absolute difference: " + minDiff);
    }
}
