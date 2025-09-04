class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();

        int len = word1.length() + word2.length();

        for(int i=0;i<len;i++){
            if(i < word1.length()){
            s.append(word1.charAt(i));
            }
            if(i < word2.length()){
            s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}
