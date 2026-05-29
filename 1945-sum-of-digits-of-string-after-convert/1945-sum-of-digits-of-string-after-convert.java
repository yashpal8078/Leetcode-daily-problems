class Solution {
    public int getLucky(String s, int k) {

        StringBuilder p = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a' + 1;
            p.append(val);
        }

        String num = p.toString();

        while (k > 0) {
            int sum = 0;

            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }

            num = String.valueOf(sum);
            k--;
        }

        return Integer.parseInt(num);
    }
}