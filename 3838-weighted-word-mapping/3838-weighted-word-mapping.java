class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                sum += weights[c - 'a'];
            }

            sum %= 26;
            sb.append((char)('z' - sum));
        }

        return sb.toString();
    }
}