import java.util.Arrays;
import java.util.Comparator;

public class ChainPairs {
    
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40},{50,90}};

        Arrays.sort(pairs , Comparator.comparingInt(a -> a[1]));

        int chainLength = 1;
        int lastEnd = pairs[0][1]; //last selected pair end // chain end

        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0] > lastEnd){
                chainLength++;
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum length of chain: " + chainLength);  

    }
}
