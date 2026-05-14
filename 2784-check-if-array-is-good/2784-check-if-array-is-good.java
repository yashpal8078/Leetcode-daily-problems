class Solution {
    public boolean isGood(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int max = -1;
       int count = 0;
       for(int i = 0;i<nums.length;i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        if(map.get(nums[i]) == 2){
            count++;
        }
        if(count > 1){
            return false;
        }
        
        max = Math.max(max,nums[i]);
       }

       return (nums.length-1 == max) && (map.get(max) == 2);
    }
}