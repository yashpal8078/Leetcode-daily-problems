class Solution {
    public int[] separateDigits(int[] nums) {
        String ch = "";

        for(int i = 0;i<nums.length;i++){
            ch  = ch+ String.valueOf(nums[i]);
        }

        int[] ans = new int[ch.length()];
        for(int i= 0;i<ch.length();i++){
            ans[i] = ch.charAt(i)-'0';
        }

        return ans;
    }
}