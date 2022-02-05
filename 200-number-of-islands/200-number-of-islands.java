class Solution {
    public int numIslands(char[][] grid) {
        
        
        int[][] vis = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i=0 ; i<grid.length ; i++)
            for(int j=0 ; j<grid[0].length ; j++){
                if(vis[i][j]!=1 && grid[i][j]=='1'){
                    dfs(grid, i, j, vis);
                    res++;
                }
            }
        
        return res;
    }
    
    public void dfs(char[][] grid, int x, int y, int[][]vis){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || vis[x][y]==1)
            return;
        
        if(grid[x][y] == '0')
            return;
        
        vis[x][y] = 1;
        dfs(grid, x+1, y, vis);
        dfs(grid, x-1, y, vis);
        dfs(grid, x, y+1, vis);
        dfs(grid, x, y-1, vis);
   
    }
}













































/*

 boolean[][] seen = new boolean[grid.length][grid[0].length];
        int ans = 0;
        
        for (int i = 0; i < grid.length; i++) {
          for (int j = 0; j < grid[i].length; j++) {
            if (!seen[i][j] && grid[i][j] == '1') {
                dfs(grid, i, j, seen);
                ans++;
            }
          }
        }
        
        return ans;
        
    }
    
    public void dfs(char[][] grid, int r, int c, boolean[][] vis){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || vis[r][c] || grid[r][c]=='0')
            return;
        
        vis[r][c] = true;
        dfs(grid, r+1, c, vis);
        dfs(grid, r, c+1, vis);
        dfs(grid, r-1, c, vis);
        dfs(grid, r, c-1, vis);

*/