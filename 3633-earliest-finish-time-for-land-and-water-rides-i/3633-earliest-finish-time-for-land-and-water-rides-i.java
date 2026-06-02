class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int min = Integer.MAX_VALUE;
        
    
        for(int i = 0;i<landDuration.length;i++){

            int curr = landStartTime[i] + landDuration[i];

            for(int j = 0;j< waterStartTime.length ; j++){
            
            int val = Math.max(curr,waterStartTime[j]);
              
            val += waterDuration[j];

            min = Math.min(min , val);

        }
        }

          for(int i = 0;i<waterStartTime.length;i++){

            int curr = waterStartTime[i] +  waterDuration[i];

            for(int j = 0;j< landDuration.length ; j++){
            
            int val = Math.max(curr,landStartTime[j]);
              
            val += landDuration[j];

            min = Math.min(min , val);

        }
        }

        return min;

    }
}