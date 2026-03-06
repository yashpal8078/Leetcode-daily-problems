public class IndianCoins {
    
    public static void main(String[] args) {
        
        Integer conins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 2758;
        int count = 0;
        for(int i = conins.length-1;i>=0;i--){
            while(amount >= conins[i]){
                amount -= conins[i];
                count++;
            }
        }
        System.out.println("Minimum number of coins: " + count);
    }
}
