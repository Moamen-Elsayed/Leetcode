class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> paths = new ArrayList<>();
        if(graph == null || graph.length == 0)
            return paths;
        
        dfs(graph, 0, new ArrayList<>(), paths);
        
        return paths;
        
    }
    
    void dfs(int[][] g, int node, List<Integer> path, List<List <Integer>> paths){
        path.add(node);
        if(node == g.length-1){
            paths.add(new ArrayList<>(path));
            return;
        }
        
        int[] nextNodes = g[node];
        for(int nextnode : nextNodes){
            dfs(g, nextnode, path, paths);
            path.remove(path.size() - 1);
        }
    }
}