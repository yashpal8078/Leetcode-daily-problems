class Solution {
    public int minMirrorPairDistance(int[] nums) {

        HashMap<Integer,Integer> map  = new HashMap<>();

        int minDis = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){

            int newNum = reverse(nums[i]);
            if(map.containsKey(nums[i])){
                minDis = Math.min(minDis , Math.abs(map.get(nums[i]) - i));
            }
            map.put(newNum , i);
        }

        return minDis !=  Integer.MAX_VALUE ? minDis : -1;

    }

    private int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
     
     return rev;
    }
}