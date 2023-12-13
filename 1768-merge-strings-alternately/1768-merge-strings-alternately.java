class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        while (index < word1.length() && index < word2.length()) {
            res.append(word1.charAt(index)).append(word2.charAt(index++));
        }
        res.append((word1.substring(index, word1.length())));
        res.append((word2.substring(index, word2.length())));
        return res.toString();
    }
                        
}