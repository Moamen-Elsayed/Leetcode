/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> allLevels = new ArrayList<>();
        if (root == null)
			return allLevels;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode tmp = q.poll();
                level.add(tmp.val);

                if(tmp.left != null)
                    q.add(tmp.left);
                if(tmp.right != null)
                    q.add(tmp.right);
            }
            
            allLevels.add(level);
        }
        
        return allLevels;
        
    }
}