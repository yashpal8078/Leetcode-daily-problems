class Solution {
    public int minElement(int[] nums) {
         
         int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){

            int sum = 0;
            int num = nums[i];
            while(num > 0){
              sum += num%10;
              num/=10;
        }

        min = Math.min(sum , min);
        
    }

    return min;
}
}