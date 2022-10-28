class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String newStr = String.valueOf(c);
            if(!map.containsKey(newStr)) 
                map.put(newStr, new ArrayList<>());
            map.get(newStr).add(s);
        }
        
        return new ArrayList<>(map.values());
        
    }
}