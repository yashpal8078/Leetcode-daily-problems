class Solution {
    public String decodeString(String s) {

        Stack<Integer> numSt = new Stack<>();
        Stack<String> str= new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numSt.push(num);
                str.push(curr);

                num = 0;
                curr = "";
            }

            else if (ch == ']') {

                int repeat = numSt.pop();
                String temp = "";

                for (int i = 0; i < repeat; i++) {
                    temp += curr;
                }

                curr = str.pop() + temp;
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}