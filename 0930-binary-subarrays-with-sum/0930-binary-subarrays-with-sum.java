class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer,Integer> map  =  new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int ans = 0;

        for (int num : nums) {

            prefixSum += num;

            ans += map.getOrDefault(prefixSum - goal, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }


        return ans;

    }
}