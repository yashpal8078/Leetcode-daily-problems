class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
         if (nums.length % k != 0) return false;

        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        while (!freq.isEmpty()) {

            int start = freq.firstKey();

            int count = freq.get(start);

            for (int i = 0; i < k; i++) {
                int card = start + i;

                if (!freq.containsKey(card) || freq.get(card) < count) return false;

              
                if (freq.get(card) == count) freq.remove(card);
                else freq.put(card, freq.get(card) - count);
            }
        }

        
        return true;
    }
}