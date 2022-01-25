class Solution {
    
    boolean found;
    
    public void dfs(Map<Integer, List<Integer>> g, boolean[] vis, int s, int d){
        
        // if we found or we returned to the start point again
        if(vis[s] || found)
            return;
        
        // if not 
        vis[s] = true;
        
            // loop over the neighbors
        for(int n : g.get(s)){
            // if you found the neighbor that = destination 
            if(n == d){
                found = true;
                break;
            }
            // if not
            if(!vis[n])
                dfs(g, vis, n, d); // recursive for this neighbor
        }
        
 
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source == destination)
            return true;
        
        found = false;
        
        
        boolean[] vis = new boolean[n];
        Map<Integer, List<Integer>> graph = new HashMap();
        
        for(int i=0 ; i<n ; i++){
            graph.put(i, new ArrayList());
        }
        
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        dfs(graph, vis, source, destination);
                
            
        
        return found;
    }
}