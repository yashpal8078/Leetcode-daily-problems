class Solution {
    public int countBeautifulPairs(int[] nums) {

        int count = 0;
        for(int i  = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int f = getf(nums[i]);
                int l = getl(nums[j]);
                if(isCoprime(f,l)){
                    count++;
                }
            }
        }

        return count;
        
    }


    private int getf(int n){
        while(n >= 10){
            n/=10;
        }
        return n;
    }

    private int getl(int n){
        return n%10;
    }

   private boolean isCoprime(int a,int b){

         while(b != 0){
              int temp = b;
              b = a%b;
              a = temp;
         }

         return a == 1;
   }
}