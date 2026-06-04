class Solution {
    public int compress(char[] chars) {
        
        StringBuilder sb = new StringBuilder();
         
         for(int i =0; i < chars.length;){
            int count  = 0;
            char c = chars[i];
            
            while( i < chars.length && chars[i] == c){
                count++;
                i++;
            }
            sb.append(c);
            if(count > 1) sb.append(count); 
         }

         for(int i = 0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
         }
     
        return sb.length();
    }
}