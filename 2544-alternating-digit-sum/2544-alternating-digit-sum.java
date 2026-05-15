class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        if(s.length() % 2 == 0 ){
            boolean t = true;
            for(int i = 0;i<s.length();i++){
                int digit = s.charAt(i) -'0';
                sum += (t==false) ? -digit: digit;
                t = !t;
            }
            
        }else{
            boolean t = true;
            for(int i = 0;i<s.length();i++){
                int digit = s.charAt(i) -'0';
                sum += (t==false) ? -digit: digit;
                t = !t;
            }
        }
        return sum;
    }
}