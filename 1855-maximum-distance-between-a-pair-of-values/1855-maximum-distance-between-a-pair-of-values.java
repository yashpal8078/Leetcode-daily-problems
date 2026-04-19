class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;


        int i = 0,j = 0;
        int maxIdx  = 0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                i++;
            }else{
                maxIdx = Math.max(maxIdx , j-i);
                j++;
            }
        }

        return maxIdx;
    }
}