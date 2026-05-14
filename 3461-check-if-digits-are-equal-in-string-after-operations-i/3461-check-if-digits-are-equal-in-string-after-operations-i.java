class Solution {
    public boolean hasSameDigits(String s) {
           
         int arr[] = new int[s.length()];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';
        }

        while(arr.length>2){
            int[]  temp = new int[arr.length-1];
            
            for(int i=0;i<arr.length-1;i++){
                temp[i]=(arr[i]+arr[i+1])%10;
            }
            arr=temp;
        }
        
       return arr[0]==arr[1];

    }
}