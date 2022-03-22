class Solution {
    public int fib(int n) {
//         int[] memo = new int[31];
//         memo[0] = 0;
//         memo[1] = 1;
//         for(int i = 2 ; i <= n ; i++){
//             memo[i] = memo[i-1] + memo[i-2]; 
//         }
        
//         return memo[n];
        if(n == 0)
            return 0;
        int first = 0, second = 1;
        for(int i= 2 ; i<=n ; i++){
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        
        return second;
        
        
    }
}