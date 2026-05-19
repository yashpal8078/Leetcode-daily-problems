class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
         

        //  HashMap<Integer,Integer> map = new HashMap<>();

        //  for(int i = 0;i<nums1.length;i++){
        //     map.put(nums1[i] , i);
        //  }
        //  for(int i = 0;i<nums2.length;i++){
        //     if(map.containsKey(nums2[i])){
        //         return nums2[i];
        //     }
        //  }

        // return -1;
        int i = 0,j =0;
        int n = nums1.length;
        int m = nums2.length;

         while(i < n & j < m)
        {
            if(nums1[i] == nums2[j])
            {
                return nums1[i];
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }else{
                j++;
            }
        }

        return -1;
    }
}