class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
         
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
             min = Math.min(min,nums[i]);
             max = Math.max(max,nums[i]);
        }

        for(int i=min;i<=max;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }

        return ans;

    }
}