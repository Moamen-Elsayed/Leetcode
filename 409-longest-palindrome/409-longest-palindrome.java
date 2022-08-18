class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!mp.containsKey(ch)) mp.put(ch, 1);
            else mp.put(ch, mp.get(ch)+1);
        }
        
        int maxLen = 0, flag=0;
        
        for(Map.Entry<Character, Integer> m : mp.entrySet()){
            if(m.getValue() % 2 == 0) maxLen += m.getValue();
            else if(m.getValue() % 2 != 0){
                maxLen += m.getValue()-1;
                flag = 1;
            }
        }
        
       
        
        return maxLen + flag;
    }
}