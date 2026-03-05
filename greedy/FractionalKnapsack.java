
import java.util.Comparator;

public class FractionalKnapsack {
    
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;

        double ratio[][] = new double[weight.length][2];
        for (int i = 0; i < weight.length; i++) {
          
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        java.util.Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacityLeft = capacity;
        double totalValue = 0.0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (weight[idx] <= capacityLeft) {
                totalValue += value[idx];
                capacityLeft -= weight[idx];
            } else {
                totalValue += ratio[i][1] * capacityLeft;
                break;
            }
        }
        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}
