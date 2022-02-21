class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0 || s == null) return false;
        
        Set<String> Dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1]; 
        for(int i=0 ; i<s.length() ; i++)
            for(int j=0 ; j<=i ; j++){
                String sub = s.substring(j, i + 1);
                
                if(Dict.contains(sub) && (j==0 || dp[j-1])){
                    dp[i] = true;
                    break;
                }
            }  
        
        return dp[s.length() - 1];
    }
}