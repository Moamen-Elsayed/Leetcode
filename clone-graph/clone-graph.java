/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        return dfs(node, new HashMap<>());
        
    }
    
    public Node dfs(Node current, HashMap<Node, Node> visited){
        if(current == null)
            return null;
        
        if(visited.containsKey(current))
            return visited.get(current);
        
        Node node = new Node(current.val);
        visited.put(current, node);
        
        for(Node n : current.neighbors)
            node.neighbors.add(dfs(n, visited));
        
        
        return node;
    }
}