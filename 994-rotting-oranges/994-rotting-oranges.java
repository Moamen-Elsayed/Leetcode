class Solution {
    
    public int orangesRotting(int[][] grid) {
        
        if(grid == null || grid.length == 0) return -1;
        
        int minutes = 2;
        for(int i=0 ; i<grid.length ; i++)
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 2)
                  dfs(grid, i, j, minutes);
            }
        
        for(int[] row : grid)
            for(int cell : row){
                if(cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        
        return minutes-2;
        
        
    }
    
    void dfs(int[][] grid, int x, int y, int minute){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] == 0 || (1 < grid[x][y] && grid[x][y] < minute))
            return;
        
        
        
        grid[x][y] = minute;
        dfs(grid, x+1, y, minute+1);
        dfs(grid, x, y+1, minute+1);
        dfs(grid, x-1, y, minute+1);
        dfs(grid, x, y-1, minute+1);
    }
}