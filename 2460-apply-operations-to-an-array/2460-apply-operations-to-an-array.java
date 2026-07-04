class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans  = new int[nums.length];

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }

        int count  = 0;

        int k = 0;
        for(int i  = 0;i<ans.length;i++){
            if(nums[i] == 0){
                count++;
            }else{
                ans[k++] = nums[i];
            }
        }

        while(k < ans.length){
            ans[k++] = 0;
        }

     return ans;

    }
}