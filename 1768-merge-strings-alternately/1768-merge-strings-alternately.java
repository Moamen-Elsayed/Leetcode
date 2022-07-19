class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0 , j=0;
        StringBuilder sb = new StringBuilder("");
        while(i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++; j++;
        }
        
        System.out.println(i); System.out.println(j);
        
        // if(i < word1.length()) sb.append(word1.substring(i));
        // if(j < word2.length()) sb.append(word1.substring(j));
        
        while(i <  word1.length()) {sb.append(word1.charAt(i)); i++;}
        while(j < word2.length()) {sb.append(word2.charAt(j)); j++;}
        
        return sb.toString();
    }
}