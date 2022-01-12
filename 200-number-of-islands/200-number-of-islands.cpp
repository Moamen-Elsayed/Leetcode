class Solution {
public:
    
    void dfs(vector<vector<char>>& grid, int c, int r, vector<vector<bool>>& vis){
        if(c>=grid.size() || c<0 || r>=grid[0].size() || r<0 || vis[c][r]==1 || grid[c][r]!='1')
            return;
        
        vis[c][r] = 1;
        dfs(grid, c+1, r, vis);
        dfs(grid, c, r+1, vis);
        dfs(grid, c-1, r, vis);
        dfs(grid, c, r-1, vis);
    }
    
    
    
    
    int numIslands(vector<vector<char>>& grid) {
        int ans = 0;
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<bool>> vis(m,vector<bool>(n,0));
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                vis[i][j] = 0;
            }
        }
        
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    ans++;
                    dfs(grid, i, j, vis);
                }
            }
        }
        
        return ans;
    }
};