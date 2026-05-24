class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i]) <= k){
                list.add(nums[i]);
            }
        }

        int[] outArr = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            outArr[i] = list.get(i);
        }

        return outArr;
    }
}