class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx = -1;

        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                idx = i;
            } else if (count >= maxCount) {
                maxCount = count;
            }

        }

        return new int[] { idx, maxCount };
    }
}