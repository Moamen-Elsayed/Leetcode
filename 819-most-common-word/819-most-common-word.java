class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String[] words = paragraph.split("[!?',;. ]+");
        Map <String, Integer> wordCount = new HashMap<>();
        Set<String> bannedWords = new HashSet();
        for(String word : banned)
            bannedWords.add(word);
        
        
        for(String word : words){
            if(!bannedWords.contains(word.toLowerCase()))
                wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        
        
        
        
        
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        
    }
}