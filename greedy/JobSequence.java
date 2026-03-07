
import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {
    
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        
        int jobInfo[][] = {{4, 20}, { 1, 10}, { 1, 40}, { 1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i+1, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int time = 0;
        int maxProfit = 0;

        for(Job job: jobs){

            if(time < job.deadline){

                time++;
                maxProfit += job.profit;

                System.out.println("Job " + job.id + " is selected with profit " + job.profit);
            }
        }

        System.out.println("Maximum profit: " + maxProfit);

        

    }
}
