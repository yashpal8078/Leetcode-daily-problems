public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

         int i = 0;
         int j = i+1;

         while(i < nums.length && j < nums.length){
             if(nums[i] == nums[j]){
                 j++;
             } else {
                 i++;
                 nums[i] = nums[j];
                 j++;
             }
         }
         return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}