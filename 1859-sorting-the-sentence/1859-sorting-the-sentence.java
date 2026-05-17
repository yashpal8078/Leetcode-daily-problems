class Solution {
    public String sortSentence(String s) {
        String w[]=s.split(" ");
        StringBuilder str = new StringBuilder();
        
          for (char ch = '1'; ch <= '9'; ch++) {

            for (int i = 0; i < w.length; i++) {

                if (w[i].contains(String.valueOf(ch))) {

                    str.append(w[i].substring(0, w[i].length() - 1));
                    str.append(" ");
                }
            }
        }

        return str.toString().trim();
    }
}