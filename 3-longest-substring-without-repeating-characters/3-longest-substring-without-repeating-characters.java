class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mx=0, start=0, cnt=0;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i=0 ; i<s.length() ; i++){
            if(!mp.containsKey(s.charAt(i)))
                cnt++;
            else{
                if(mp.get(s.charAt(i)) < start){
                    cnt++;
                }else{
                    start = mp.get(s.charAt(i)) + 1;
                    cnt = (i - start) + 1;
                } 
            }
            
            mp.put(s.charAt(i), i);
            mx = Math.max(mx, cnt);
        }
        
        return mx;
    }
}