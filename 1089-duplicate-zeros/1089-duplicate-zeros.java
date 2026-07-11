class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; 
        
        int tempIndex = 0;
        
        for (int i = 0; i < n && tempIndex < n; i++) {
            if (arr[i] == 0) {
                temp[tempIndex] = 0;
                tempIndex++;
                
                if (tempIndex < n) {
                    temp[tempIndex] = 0;
                    tempIndex++;
                }
            } else {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
