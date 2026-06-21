class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] indexNums = new int[n][2];

        for(int i = 0;i<n;i++){
            indexNums[i][0] = nums[i];
            indexNums[i][1] = i;
        }


        Arrays.sort(indexNums,(a,b)->b[0]-a[0]);

        int[][] topValue = Arrays.copyOfRange(indexNums,0,k);

        Arrays.sort(topValue,(a,b)->a[1]-b[1]);

      int[] result = new int[k];
      for(int i = 0;i<k;i++){
        result[i] = topValue[i][0];
      }

      return result;
    }
}