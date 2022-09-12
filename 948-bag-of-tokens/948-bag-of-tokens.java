class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        int n = tokens.length;
        int score = 0;
        
        if(n == 0)
            return score;
        
        Arrays.sort(tokens);
        
        for(int i=0 ; i<n ; i++){
            if(power >= tokens[i]){
                power -= tokens[i];
                score++;
            }else if(tokens[i] < tokens[n-1]+power && score >= 1){
                power += tokens[n - 1]; 
                score--;
                n -= 1;
                
                power -= tokens[i];
                score++;
            }   
        }
        
        return score;
    }
}