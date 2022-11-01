class Solution {
    public int[] findBall(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[] result = new int[n];
        
        for(int i=0 ; i<n ; i++){
            int c=i;
            for(int j=0 ; j<m ; j++){
                int next_c = c + grid[j][c];
                if(next_c < 0 || next_c > n-1 || grid[j][c] != grid[j][next_c]){
                    result[i] = -1;
                    break;
                }
                result[i] = next_c;
                c = next_c;
            }   
        }
        
        return result;
        
    }
}