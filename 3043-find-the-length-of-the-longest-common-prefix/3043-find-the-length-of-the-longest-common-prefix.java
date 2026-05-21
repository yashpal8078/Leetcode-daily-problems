class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int val : arr1){

            while(!set.contains(val) && val > 0){
                set.add(val);
                val = val/10;
            }

        }

        int res = 0;

        for(int num : arr2){

            while(!set.contains(num) && num > 0){
                num  =  num/10;
            }

            if(num > 0){
                res = Math.max(res,(int)Math.log10(num)+1);
            }
        }
        return res;
    }
}