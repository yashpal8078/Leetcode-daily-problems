class LastStone {
    public int lastStoneWeight(int[] stones) {
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if (stone1 != stone2) {
                maxHeap.offer(stone1 - stone2);  
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        LastStone solution = new LastStone();
        int[] stones = {2,7,4,1,8,1};
        int result = solution.lastStoneWeight(stones);
        System.out.println("Last stone weight: " + result); // Output: 1
    }
}