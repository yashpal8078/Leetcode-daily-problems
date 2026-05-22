class Solution {
    public int subarraySum(int[] nums, int k) {
    //  int prefix =0;
    //  int count = 0;
    //  HashMap<Integer,Integer> map = new HashMap<>();
    //  map.put(0,1); 

    //  for(int i = 0;i<nums.length;i++){
    //     prefix+=nums[i];
    //     int remove = prefix-k;
    //     count+=map.getOrDefault(remove,0);
    //     map.put(prefix,map.getOrDefault(prefix,0)+1);
       
    //  }

    //     return count;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}

//    int i = 0;
// int j = 0;
// int sum = 0;
// int max = 0;

// while (j < nums.length) {

//     sum += nums[j];

//     while (sum > k) {   
//         sum -= nums[i];
//         i++;
//     }

//     if (sum == k) {
//         max = Math.max(max, j - i + 1);
//     }

//     j++;
// }
//     return max;
//     }
// }