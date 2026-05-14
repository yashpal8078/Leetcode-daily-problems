class Solution {
    public int[][] sortTheStudents(int[][] score, int k){

         int m = score.length;

         for(int i=0;i<m-1;i++){
            for(int j=i+1;j<m;j++){
                if(score[i][k]<score[j][k]){
                    int[] temp=score[i];
                    score[i]=score[j];
                    score[j]=temp;
                }
            }
         }
         return score;
    }
}