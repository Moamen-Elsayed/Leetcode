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
