import java.util.Arrays;
import java.util.PriorityQueue;

public class KthClosestElement {

    public static int[] kthClosest(int[] arr, int k, int x) {
        int n = arr.length;
        int originalK = k;

        // Max Heap based on distance from x
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> Math.abs(b - x) - Math.abs(a - x));

        for (int i = 0; i < n; i++) {
            if (maxHeap.size() < k) {
                maxHeap.add(arr[i]);
            } else {
                // If current element is closer than the farthest in heap
                if (Math.abs(arr[i] - x) < Math.abs(maxHeap.peek() - x)) {
                    maxHeap.poll();
                    maxHeap.add(arr[i]);
                }
            }
        }

        int[] result = new int[originalK];
        for (int i = 0; i < originalK; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int[] result = kthClosest(arr, k, 3);

        System.out.println("Closest elements: " + Arrays.toString(result));
    }
}
