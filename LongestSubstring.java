import java.util.HashMap;

public class LongestSubstring {
    public static int longestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0, j = 0;
        int max = -1;

        while (j < s.length()) {

            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() < j-i+1) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) map.remove(left);
                i++;
            }

           
            if (map.size() == j+1-i) {
                max = Math.max(max, j - i + 1);
            }

            j++;
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + longestSubstring(s));
    }
}
