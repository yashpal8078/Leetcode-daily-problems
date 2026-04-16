class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> ans = new ArrayList<>();

       
        for (int q : queries) {
            List<Integer> list = map.get(nums[q]);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(list, q);

            int left = (pos - 1 + list.size()) % list.size();
            int right = (pos + 1) % list.size();

            int leftIdx = list.get(left);
            int rightIdx = list.get(right);

    
            int d1 = Math.abs(q - leftIdx);
            d1 = Math.min(d1, n - d1);

            int d2 = Math.abs(q - rightIdx);
            d2 = Math.min(d2, n - d2);

            ans.add(Math.min(d1, d2));
        }

        return ans;
    }
}