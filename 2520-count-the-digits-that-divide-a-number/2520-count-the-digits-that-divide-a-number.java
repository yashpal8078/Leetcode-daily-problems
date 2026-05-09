class Solution {
    public int countDigits(int num) {
        int count = 0;
        int org = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
             if(org % rem == 0){
                count++;
             }
             num/=10;
        }

        return count;
    }
}