class Solution {
    public int numberOfSpecialChars(String word) {
        int[]freq = new int[26];
        int[]freqMap  = new int[26];
        
        
        for(int i  =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a'] = 1;
            }else{
                freqMap[ch - 'A'] = 1;
            }
        }

        int count = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] == 1 && freqMap[i] == 1){
                count++;
            }
        }

        return count;

    }
}