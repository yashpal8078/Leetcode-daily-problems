class Solution {
    public boolean digitCount(String num) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int i = 0; i < num.length(); i++) {
            int key = num.charAt(i) - '0';
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

     
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            int actual = map.getOrDefault(i, 0);

            if (actual != expected) {
                return false;
            }
        }

        return true;
    }
}