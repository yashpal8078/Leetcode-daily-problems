public class CarPolling {
    

    public static boolean carPooling(int[][] trips, int capacity) {
        int[] timeline = new int[1001];

        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int startLocation = trip[1];
            int endLocation = trip[2];

            timeline[startLocation] += numPassengers;
            timeline[endLocation] -= numPassengers;
        }

        int currentPassengers = 0;
        for (int passengers : timeline) {
            currentPassengers += passengers;
            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] trips = { {2, 1, 5}, {3, 3, 7} };
        int capacity = 5;
        boolean result = carPooling(trips, capacity);
        System.out.println("Can the car accommodate all trips? " + result);
    }
}

