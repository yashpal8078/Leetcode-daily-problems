class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m+1][n+1];
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        return dfs(0,0,m,n,dp,obstacleGrid);
    }

     private int dfs(int i, int j, int m,int n,int[][]dp,int[][]obstacleGrid){
        if(i == m-1 && j == n-1){
            if(obstacleGrid[i][j] == 1){
                return 0;
            }
            return 1;

        }

        if(i >= m || j >= n ){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int val1 = ( i+1 < m && obstacleGrid[i+1][j] != 1) ? dfs(i+1,j,m,n,dp,obstacleGrid) : 0 ;
        int val2 =  (j+1 < n && obstacleGrid[i][j+1] != 1) ? dfs(i,j+1,m,n,dp,obstacleGrid) : 0;
        return dp[i][j] = val1 + val2;
    }
}