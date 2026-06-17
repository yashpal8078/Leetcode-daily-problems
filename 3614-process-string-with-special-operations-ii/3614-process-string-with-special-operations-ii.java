class Solution {
    public char processStr(String s, long k) {

        int n = s.length();
        long[] len = new long[n];

        long cur = 0;
        long LIMIT = (long)1e15 + 1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                cur++;
            } else if (ch == '*') {
                if (cur > 0) cur--;
            } else if (ch == '#') {
                cur = Math.min(LIMIT, cur * 2);
            } else { 
                
            }

            len[i] = cur;
        }

        if (k >= cur) return '.';

        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);
            long currLen = len[i];
            long prevLen = (i == 0) ? 0 : len[i - 1];

            if (ch >= 'a' && ch <= 'z') {

                if (k == currLen - 1) {
                    return ch;
                }

            } else if (ch == '*') {

                

            } else if (ch == '#') {

                k %= prevLen;

            } else { 

                k = currLen - 1 - k;
            }
        }

        return '.';
    }
}