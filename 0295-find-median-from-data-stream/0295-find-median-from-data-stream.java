class MedianFinder {

    ArrayList<Integer> arr;

    public MedianFinder() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {

        int idx = Collections.binarySearch(arr, num);

        if (idx < 0)
            idx = -idx - 1;

        arr.add(idx, num);
    }

    public double findMedian() {

        int n = arr.size();

        if (n % 2 == 1)
            return arr.get(n / 2);

        return (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;
    }
}