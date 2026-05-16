class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
       int currMax = -1; 
       int max = -1;
       int count = 0;
       for(int i = nums.length-1;i>=0;i--){
            if(i+1 < nums.length && nums[i] == nums[i+1]) continue;;
            currMax = nums[i];
            max = Math.max(nums[i] , max);
            count++;
            if(count==3){
                break;
            }
       }
       return count == 3 ? currMax : max;
    }
}