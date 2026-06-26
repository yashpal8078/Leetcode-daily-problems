class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int[] a = new int[2];
        int x = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == x + 1) {
                x++;
            } else if (nums[i] == x) {
                a[0] = nums[i];
            } else {
                a[1] = x + 1;
                x++;
                i--;
            }
        }

        if (a[1] == 0)
            a[1] = nums.length;

        return a;
    }
}