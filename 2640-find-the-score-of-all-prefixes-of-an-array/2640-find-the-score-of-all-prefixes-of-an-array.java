class Solution {
    public long[] findPrefixScore(int[] nums) {

        long[] conversion = new long[nums.length];
        
        int max = nums[0];
        conversion[0] = nums[0]+max;
        for(int i  = 1;i<nums.length;i++){
             max  = Math.max(max,nums[i]);
             conversion[i]  = nums[i] + max;
             conversion[i]  = conversion[i-1] + conversion[i];
        }

        return conversion;
        
    }
}