class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        
        boolean [][] vis = new boolean [image.length][image[0].length];
        int oldColor = image[sr][sc];
        
        dfs(image, sr, sc, oldColor, newColor, vis);
        return image;
        
    }
    
    public void dfs(int[][] img , int i, int j, int oldColor, int newColor, boolean[][] vis){
        if(i<0 || i>=img.length || j<0 || j>=img[0].length || vis[i][j] == true)
            return;
        if(img[i][j] != oldColor)
            return;
        
        vis[i][j] = true;
        img[i][j] = newColor;
        dfs(img, i+1 , j , oldColor, newColor, vis);
        dfs(img, i , j+1 , oldColor, newColor, vis);
        dfs(img, i-1 , j , oldColor, newColor, vis);
        dfs(img, i , j-1 , oldColor, newColor, vis);
    }
    
  
}