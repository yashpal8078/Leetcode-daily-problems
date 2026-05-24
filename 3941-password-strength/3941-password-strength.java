class Solution {
    public int passwordStrength(String password) {
        Map<Character,Integer> freqMap = new HashMap<>();
        int ans = 0;
        for(int i = 0;i<password.length();i++){
            char c = password.charAt(i);
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

            if(freqMap.get(c) == 1){
                if(c >= 'a' && c <= 'z' ){
                    ans++;
                }else if( c >='A' && c <= 'Z'){
                    ans+=2;
                }else if(Character.isDigit(c)){
                    ans+=3;
                }else{
                    ans+=5;
                }
            }

        }

        return ans;
    }
}