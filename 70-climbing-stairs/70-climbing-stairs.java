class Solution {
    public int climbStairs(int n) {
        
        int first = 1, second = 1;
        for(int i=2 ; i<=n ; i++){
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        
        return second;
        
        
        
       
    }
}





























































































/*
int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
*/