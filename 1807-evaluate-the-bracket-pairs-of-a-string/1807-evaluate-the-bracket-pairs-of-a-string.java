import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        Stack<Character> stack = new Stack<>();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {

                StringBuilder key = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '(') {
                    key.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

                key.reverse();

                if (map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                } else {
                    ans.append("?");
                }
            }

            else {
                if (!stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}