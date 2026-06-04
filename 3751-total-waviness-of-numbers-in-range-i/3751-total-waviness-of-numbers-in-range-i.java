class Solution {
    public int totalWaviness(int num1, int num2) {

        int total = 0;

        for (int n = num1; n <= num2; n++) {

            String s = Integer.toString(n);
            if (s.length() < 3) continue;

            int waviness = 0;
            for (int i = 1; i < s.length() - 1; i++) {
                char prev = s.charAt(i - 1);
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);

                if (curr > prev && curr > next) {
                    waviness++;
                }
                else if (curr < prev && curr < next) {
                    waviness++;
                }
            }

            total += waviness;
        }

        return total;
    }
}
