class Solution {
    public long gcdSum(int[] nums) {
        long sum=0;
        int mx =0;
        long arr[] = new long[nums.length];
        long ans =0;
         for(int i=0;i<nums.length;i++){
             mx=Math.max(nums[i],mx);
            ans=gcd(mx,nums[i]);
             arr[i]=ans;
         }
         Arrays.sort(arr);
         int i=0;
         int j = arr.length-1;
         while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;
            j--;
         }
          return sum;
    }
   public long gcd(long a, long b){
    while(b != 0){
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}