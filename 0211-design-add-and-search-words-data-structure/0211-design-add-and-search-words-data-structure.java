class WordDictionary {
    List<String> ans;

    public WordDictionary() {

            ans = new ArrayList<>();
    }
    
    public void addWord(String word) {

        ans.add(word);
        
    }
    
    public boolean search(String word) {
       for (String s : ans) {

            if (s.length() != word.length()) {
                continue;
            }

            boolean match = true;

            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) != '.' &&
                    word.charAt(i) != s.charAt(i)) {

                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */