import java.util.*;

class Solution {
    public long[] distance(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length;
        long[] ans = new long[n];

        // Step 1: Store indices
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

    
        for (ArrayList<Integer> list : map.values()) {

            int size = list.size();
            if (size == 1) continue;

            long[] prefix = new long[size];

         
            prefix[0] = list.get(0);
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            for (int i = 0; i < size; i++) {
                int idx = list.get(i);

                long left = (long) list.get(i) * i - (i > 0 ? prefix[i - 1] : 0);
                long right = (prefix[size - 1] - prefix[i]) - (long) list.get(i) * (size - i - 1);

                ans[idx] = left + right;
            }
        }

        return ans;
    }
}