class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int subString=0;
        int countA=0,countB=0,countC=0;
        int n=s.length();
        for(int right=0;right<n;right++){
            char charRight=s.charAt(right);
            if(charRight=='a') countA++;
            else if(charRight=='b') countB++;
            else countC++;
            while(countA>=1 && countB>=1 && countC>=1){
                subString+=n-right;
                char charLeft=s.charAt(left);
                if(charLeft=='a') countA--;
                else if(charLeft=='b') countB--;
                else countC--;
                left++;
            }
        }
        return subString;
    }
}
