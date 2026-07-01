class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        if(nums.length == 1) return 0;
        if(nums.length == 2) return 0;
        Arrays.sort(nums);
        for(int i = 1;i<nums.length-1;i++){
            if(nums[0] < nums[i] && nums[i] < nums[nums.length-1]){
                count++;
            }
        }

        return count;
    }
}