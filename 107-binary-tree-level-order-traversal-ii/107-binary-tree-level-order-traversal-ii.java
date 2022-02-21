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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lvls = new ArrayList<>();
        if(root == null) return lvls;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> lvl = new ArrayList<>();
            int qsize = q.size();
            for(int i=0 ; i<qsize ; i++){
                TreeNode tmp = q.poll();
                lvl.add(0, tmp.val);
                
                
                if(tmp.right != null)
                    q.add(tmp.right);
                if(tmp.left != null)
                    q.add(tmp.left);
            }
            
            lvls.add(0, lvl);
        }
        
        return lvls;
    }
}