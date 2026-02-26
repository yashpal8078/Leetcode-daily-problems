class Activity {


    public static int greedy(int[] start, int[] end, int n) {
        int count = 1;
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (start[i] >= end[j]) {
                count++;
                j = i;
            }
        }

        return count;
    }
    


    public static void main(String[] args) {
        

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;

       System.out.println( greedy(start, end, n));


    }

    
}